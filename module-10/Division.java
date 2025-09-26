//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 25th, 2025
//Division Class 

package divisionProject;

public abstract class Division {
    private String divisionName;
    private int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Getters
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Abstract method
    public abstract void display();
}
