package tdd;

public class Account {

    private  String name;
    private  double balance;

    //no-- args constructor
    public Account(){}

    //required-- args contructor
    public Account(String name){
        this. name = name;

    }

    public void setname(String name, double balance){
        this . name = name;
    }
}
