package to.pkgdo.list.application;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class taskList implements taskFunctions{
    ArrayList<task> tasklist = new ArrayList<>();//create array list that will hold the tasks of class (task)
    Scanner scan =new Scanner(System.in);

    //constructor
    public taskList() {
    }

    //getter
    public ArrayList<task> getTasklist() {
        return tasklist;
    }

    //setter
    public void setTasklist(ArrayList<task> tasklist) {
        this.tasklist = tasklist;
    }
    
    //methods 
    @Override
    public void AddTask(){
        int d,m;
        String t;
        String dsc;
                
        System.out.println("enter the task title: ");
        t=scan.nextLine();        
        
       
        System.out.println("enter the task description: ");
        dsc=scan.nextLine();
        
        //obtaining a try catach exception to avoid code crashing
            
        try{//putting code in try-catch to prevent code crashing 
            System.out.println("enter the date to start(day,month): ");
            d=scan.nextInt();
            m=scan.nextInt();
            scan.nextLine();
        }//note: the year is set by default to 2023 
        catch(InputMismatchException exp){//
            System.out.println("Mismatch input !!\n");
            d=1;
            m=1;
        }//incase of input mismastch error the values will set automaticlly to 1
        date date=new date(d,m);
        task task=new task(t,dsc,date);
        tasklist.add(task);
        System.out.println("Task added successfully :D\n");
        
    }
    
    public void removeTask(){
        try{
            System.out.println("enter the task index you want to delete");
            int m = scan.nextInt();//take input the index 
            tasklist.remove(m);//use remove(int m) method that is in the array list class
            System.out.println("task removed successfully :D\n");
        }
        catch(InputMismatchException exp){//handelling mismatch exception
            System.out.println("input mismatch !!");
        }
        catch(IndexOutOfBoundsException exp){//handelling index out of boundaries exception
            System.out.println("input out of range");
        }
    }
    
    public void MarkComplete(){
        int n;
        if(tasklist.isEmpty()){
            System.out.println("there is no tasks in the list s\n");
            return;
        }
        do{
            try{
                System.out.println("enter the index of the task you want to mark as complete (input \"-1\" to cancel / there is "+tasklist.size()+"tasks ) : ");
                n=scan.nextInt();
            }
            catch(InputMismatchException exp){
                System.out.println("input mismatch !!\n");
                n=-1;//set by default the value to -1 to cancel the opperation
            }
            if(n==-1) return;
            
        }while(n>tasklist.size() || n<0);//keeping the user in choosing a task to delete and prevent index out os boudaries exception
        
        task modify=tasklist.get(n);
        modify.setStatus("complete");
        System.out.println("task marked as complete \n");
    }
    
    public void ViewTasks() {
        task t;
        if(tasklist.isEmpty()){
            System.out.println("there is no tasks\n");
        }
        for (int i = 0; i < tasklist.size(); i++) {
            int n = i;
            t = tasklist.get(i);
            System.out.println(n + "-- " + t.toString() + "\n");
            System.out.println("---------------------------------\n");
        }
    }
    
    public void exit(){
        System.out.println("exiting the app.....");
        System.exit(0);// using this method to finish the application
    }
}
