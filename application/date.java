package to.pkgdo.list.application;

public class date {
    private int day;
    private int month;
    private int year;
//constructor
    public date(int day, int month) {
        //setting conditions for day month and year in the constructor
        if(day<31 && day>=1){
            this.day = day;
        }
        else{
            this.day=1;
            System.out.println("day out of range , the day is set by deafult to 1");
        }
        
        if(12>=month && month>=1){
            this.month = month;
        }
        else{
            this.month=1;
            System.out.println("month out of range , the month is set by deafult to 1");
        }
        
        //the year is set by default as 2023
        this.year = 2023;
    }

//getters
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
//setters
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
//toStrings
    public String toString(){
        return (day+" / "+month+" / "+year);
    }
}
