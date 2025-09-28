/* 
Paul Fralix CSD-402 Assignment M10
DomesticDivision.java file 
*/
 

// DomesticDivision.java
public class DomesticDivision extends Division {
    private final String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}