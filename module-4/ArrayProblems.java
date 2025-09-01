//Juan Macias Vasquez
//Bellevue University 
//CSD402-H323 Java for Programmers (2261-DD)
//Jack Lusby
//August 31st, 2025

package arrays;

public class ArrayProblems {

    // Overloaded method for short array
    public static short average(short[] array) {
        int sum = 0; // use the int to avoid overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Overloaded method for int array
    public static int average(int[] array) {
        long sum = 0; // use long to avoid overflow
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Overloaded method for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Overloaded method for double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to print arrays nicely
    public static void printArray(String label, Object array) {
        System.out.println(label + " = " + java.util.Arrays.toString((Object[]) array));
    }

    // Overloaded printArray methods for primitive arrays (since Arrays.toString works differently)
    public static void printArray(String label, short[] array) {
        System.out.println(label + " = " + java.util.Arrays.toString(array));
    }

    public static void printArray(String label, int[] array) {
        System.out.println(label + " = " + java.util.Arrays.toString(array));
    }

    public static void printArray(String label, long[] array) {
        System.out.println(label + " = " + java.util.Arrays.toString(array));
    }

    public static void printArray(String label, double[] array) {
        System.out.println(label + " = " + java.util.Arrays.toString(array));
    }

    // Test program output I was not that original with the numbers to make sure it worked
    public static void main(String[] args) {
        short[] shortArr = {10, 20, 30};
        int[] intArr = {5, 10, 15, 20};
        long[] longArr = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArr = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Test short[]
        printArray("Short Array", shortArr);
        System.out.println("Average (short) = " + average(shortArr));
        System.out.println();

        // Test int[]
        printArray("Int Array", intArr);
        System.out.println("Average (int) = " + average(intArr));
        System.out.println();

        // Test long[]
        printArray("Long Array", longArr);
        System.out.println("Average (long) = " + average(longArr));
        System.out.println();

        // Test double[]
        printArray("Double Array", doubleArr);
        System.out.println("Average (double) = " + average(doubleArr));
        System.out.println();
    }
}

