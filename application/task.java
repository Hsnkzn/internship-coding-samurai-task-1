
package to.pkgdo.list.application;

//create class named "task" that include : title ,descripition , due date, status. 
public class task {
    private String title;
    private String description;
    private date duedate;
    private String status;

    //constructor
    public task(String title, String description, date duedate) {
        this.title = title;
        this.description = description;
        this.duedate = duedate;
        this.status="not done";
    }

    //getters
    public String getTitle() {
        return title;
    }    
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
     public date getDuedate() {
        return duedate;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDuedate(date duedate) {
        this.duedate = duedate;
    }  
    public void setStatus(String status) {
        this.status = status;
    }
    
    //toString
    public String  toString(){        
        return ("Task Title: "+getTitle()+"\nTask Description: "+getDescription()+"\nTask date: "+getDuedate().toString()+"\nTask Status: "+getStatus());
    }
    
}
