//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//September 21st, 2025 Updated on September 13th, 2025

package externalFileNumbers;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ExternalNumberFile {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            // File Writer with "append = true" will append if file exists
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write 10 random numbers
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100); // random 0–99
                bw.write(number + " ");
            }
            bw.newLine(); // separate runs
            bw.close();
            fw.close();

            // Read and display the file
            Scanner reader = new Scanner(file);
            System.out.println("\nContents of data.file:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }
    }
}

