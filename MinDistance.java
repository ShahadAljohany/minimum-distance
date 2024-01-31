
import static java.lang.Math.abs;
import java.util.Scanner;

public class MinDistance {

    public static void main(String[] args) {
        //Input: Array A[0..n − 1] of numbers
        //Output: Minimum distance between two of its elements
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter the length of the array  :");
        int length = input.nextInt(); // enter the length of the array

        int[] arr = new int[length]; // craet array 

        System.out.println(" Please fill in the array with the number of numbers you entered :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // fill in the array
        }

        System.out.println(" Minimum distance between any two array elements : "+ MinDistance(arr)); // call method and output Minimum distance 

    }

    // Create a method to calculate the minimum distance between any two array elements
    public static int MinDistance(int[] arr) {
        int dmin = 2 ^ 31 - 1; //  Initially the minimum distance

        for (int i = 0; i < arr.length - 1; i++) { 
            for (int j = 0; j < arr.length - 2; j++) {
                if (i != j && abs(arr[i] - arr[j]) < dmin) { //Compares
                    dmin = abs(arr[i] - arr[j]);
                }
            }
        }
        return dmin; // return minimum distance
    }
}
