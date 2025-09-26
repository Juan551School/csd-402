//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 25th, 2025
//DomesticDivision Subclass

package divisionProject;

public class DomesticDivision extends Division {// Subclass for Division 
    private String state;

    // The Constructor
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Implement abstract method
    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName() +
                ", Account #: " + getAccountNumber() +
                ", State: " + state);
    }
}
