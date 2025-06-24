// Program to reverse an array using stack data structure

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayWithStack {

    // Method to display the array with a message
    private static void printArray(String message, int[] array) {
        System.out.print(message);
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println(); // Move to new line after printing
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter how many numbers you want in the array: ");
        int size = input.nextInt();

        int[] numbersToReverse = new int[size];

        // Get input values from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbersToReverse[i] = input.nextInt();
        }

        // Display original array
        printArray("Array before reversing: ", numbersToReverse);

        // Create a stack to help with reversing (LIFO structure)
        Stack<Integer> reversalStack = new Stack<>();

        // Push all elements into the stack
        for (int num : numbersToReverse) {
            reversalStack.push(num);
        }

        // Pop elements from the stack back into the array
        for (int i = 0; i < numbersToReverse.length; i++) {
            numbersToReverse[i] = reversalStack.pop();
        }

        // Display reversed array
        printArray("Array after reversing: ", numbersToReverse);

        input.close();
    }
}

/*
Example:

Input:
Enter how many numbers you want in the array: 5
Enter 5 numbers:
1
2
5
7
20

Output:
Array before reversing: 1 2 5 7 20 
Array after reversing: 20 7 5 2 1 
*/
