/* 
Paul Fralix CSD-402 Assignment M10
Division.java file
*/ 

// Division.java
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}