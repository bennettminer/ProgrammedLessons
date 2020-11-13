import java.util.Random;

public class Employee {

    //vars
    Random rand = new Random();
    int upperbound = 999999;
    String n;
    String p;
    double w;
    public String name;
    public String position;
    public double wage;
    public int id = rand.nextInt(upperbound);
    public int payPeriodHours = 0;
    public int totalHours = 0;

    //constructor
    Employee(){

    }

    //methods

    public void addHours(int addedHours){
        payPeriodHours = payPeriodHours + addedHours;
        totalHours = totalHours + addedHours;
    }

    public void payCheck(){

    }

    //get

    public String getName(){
        return this.name;
    }

    public String getPosition(){
        return this.position;
    }

    public double getWage(){
        return this.wage;
    }

    public int getId(){
        return this.id;
    }

    public int getPeriod(){
        return this.payPeriodHours;
    }

    public int getTotal(){
        return this.totalHours;
    }

    //set

    public void setName(String n){
        this.n = n;
        this.name = n;
    }

    public void setPosition(String p){
        this.p = p;
        this.position = p;
    }

    public void setWage(double w){
        this.w = w;
        this.wage = w;
    }

}