//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)\
//M3: Programming Assignment
//Jack Lusby
//August 31st, 2025


package loops;

public class Loop {
    public static void main(String[] args) {
        int rows = 7; // number of rows

        // First calculate the maximum width (last row length as string)
        StringBuilder lastRow = new StringBuilder();
        int num = 1;

        // Build ascending part for last row
        for (int j = 1; j <= rows; j++) {
            lastRow.append(num).append(" ");
            num *= 2;
        }

        // Build descending part for last row
        num /= 2;
        for (int j = rows - 1; j >= 1; j--) {
            num /= 2;
            lastRow.append(num).append(" ");
        }

        int maxWidth = lastRow.length(); // maximum characters before @

        // Print each row
        for (int i = 1; i <= rows; i++) {
            StringBuilder row = new StringBuilder();

            // Build numbers for this row
            int n = 1;
            for (int j = 1; j <= i; j++) {
                row.append(n).append(" ");
                n *= 2;
            }

            n /= 2;
            for (int j = i - 1; j >= 1; j--) {
                n /= 2;
                row.append(n).append(" ");
            }

            // Convert to string for spacing adjustments
            String rowStr = row.toString();

            // Add leading spaces so the pyramid is centered
            int leftPadding = (maxWidth - rowStr.length()) / 2;
            StringBuilder finalRow = new StringBuilder();
            for (int s = 0; s < leftPadding; s++) {
                finalRow.append(" ");
            }
            finalRow.append(rowStr);

            // Pad to maxWidth + 1 so @ aligns
            while (finalRow.length() < maxWidth + 1) {
                finalRow.append(" ");
            }

            // Print row with aligned @
            System.out.println(finalRow.toString() + "@");
        }
    }
}


