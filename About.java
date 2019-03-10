import java.util.Scanner;

public class About {
    private String fullname;
    private int cash;
    private String password;
    public void  setFullname(String fullname){
        this.fullname=fullname;



    }

    public String getFullname() {
        return fullname;
    }
    public void setCash(int cash){
        this.cash=cash;
    }

    public int getCash() {
        return cash;
    }
    public void setCash1(int cash1){
        cash=cash + cash1;
    }
    public int getCash1(){
        return cash;
    }
    public void setCash12(int cash1){
        cash=cash - cash1;
    }
    public int getCash12(){
        return cash;
    }



}

