/* 
Paul Fralix CSD-402 Assignment M10
InternationalDivision.java file  
*/

// InternationalDivision.java
public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}