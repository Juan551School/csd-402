//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 25th, 2025
//InternationalDivision Subclass

package divisionProject;

public class InternationalDivision extends Division {// Subclass for Division 
    private String country;
    private String language;

    // Constructor
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Implement abstract method
    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName() +
                ", Account #: " + getAccountNumber() +
                ", Country: " + country +
                ", Language: " + language);
    }
}
