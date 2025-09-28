/*
Paul Fralix CSD-402 Assignment M10
UseDivision.java file
 */

// UseDivision.java
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intl1 = new InternationalDivision("GlobalTech", 101, "Germany", "German");
        InternationalDivision intl2 = new InternationalDivision("AsiaConnect", 102, "Japan", "Japanese");

        DomesticDivision dom1 = new DomesticDivision("EastCoastOps", 201, "Florida");
        DomesticDivision dom2 = new DomesticDivision("WestCoastOps", 202, "California");

        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
