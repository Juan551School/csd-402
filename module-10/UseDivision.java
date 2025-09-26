//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 25th, 2025
//UseDivision Subclass

package divisionProject;

public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision objects
        InternationalDivision intl1 = new InternationalDivision("Latin America Sales", 1001, "Mexico", "Spanish");
        InternationalDivision intl2 = new InternationalDivision("Asia-Pacific Ops", 1002, "Japan", "Japanese");

        // Create two DomesticDivision objects
        DomesticDivision dom1 = new DomesticDivision("East Coast Marketing", 2001, "New York");
        DomesticDivision dom2 = new DomesticDivision("Mountain Region Sales", 2002, "Colorado");

        // Display all divisions
        intl1.display();// Shows the 1st International Division
        intl2.display();// Shows the 2nd International Division
        dom1.display();// Shows the 1st Domestic Division
        dom2.display();// Shows the 2nd Domestic Division
    }
}
