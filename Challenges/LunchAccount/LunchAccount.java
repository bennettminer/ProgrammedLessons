import java.util.Random;

public class LunchAccount{
    private String name;
    private int id;
    private int balance;
    private int money;

    public LunchAccount(String name, int id, int balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }



    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getBalance(){
        return this.balance;
    }

    public void addMoney(int money){
        balance = balance + this.money;
    }
}