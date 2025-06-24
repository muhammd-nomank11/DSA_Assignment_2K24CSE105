import java.util.Scanner;

public class RecursiveArraySum {

    // Recursive method to calculate sum of array elements
    public static int sumArray(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0; // End of array
        }
        return numbers[index] + sumArray(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user how many elements they want to enter
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        // Create an array of that size
        int[] userArray = new int[size];

        // Read array elements from the user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            userArray[i] = input.nextInt();
        }

        // Call recursive function to calculate the sum
        int totalSum = sumArray(userArray, 0);

        // Display the result
        System.out.println("Sum of all elements: " + totalSum);

        input.close();
    }
}
/*
Example :
Enter the number of elements: 6
Enter 6 integers:
1
3 
5
7
9
11
Sum of all elements: 36

*/
