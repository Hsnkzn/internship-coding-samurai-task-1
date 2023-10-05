package to.pkgdo.list.application;
import java.util.Scanner;


//this page is only for the main function to try the methods of the given task

public class ToDoListApplication {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);//creating scan object to take inputs
        taskList list=new taskList();//creating the task list object
        
        while(true){//making a while loop to keep the app running unless the user askes that 
            
            System.out.println("1 - add task");
            System.out.println("2 - remove task");
            System.out.println("3 - mark as complete");
            System.out.println("4 - view tasks");
            System.out.println("5 - exit");
            System.out.println("enter the index of the task you want : ");
            int x=scan.nextInt();
            System.out.println("\n");
            
            switch (x) {//using switch instead of nested if-else statments to organize the code 
                case 1:
                    list.AddTask();
                    break;
                case 2:
                    list.removeTask();
                    break;
                case 3:
                    list.MarkComplete();
                    break;
                case 4:
                    list.ViewTasks();
                    break;
                case 5:
                    list.exit();
                    break;
                default:
                    System.out.println("wrong input !!\n");
                    
            }
        }
            
    }
    
}
