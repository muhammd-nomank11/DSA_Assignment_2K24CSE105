import java.util.Stack;
import java.util.Scanner;

// This program checks if all types of brackets in a string are correctly opened and closed
public class BracketMatcher {

    // This method verifies if the brackets in the text are balanced and properly nested
    public static boolean matchingBrackets(String text) {
        Stack<Character> openBrackets = new Stack<>();

        // Check each character in the string
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            // If it's an opening bracket, store it
            if (current == '(' || current == '{' || current == '[') {
                openBrackets.push(current);
            }
            // If it's a closing bracket, try to match it with the last opened one
            else if (current == ')' || current == '}' || current == ']') {

                // If nothing is open, it's already invalid
                if (openBrackets.isEmpty()) {
                    return false;
                }

                char lastOpen = openBrackets.pop();

                // Make sure the current closing bracket matches the last opening one
                if (current == ')' && lastOpen != '(') return false;
                if (current == '}' && lastOpen != '{') return false;
                if (current == ']' && lastOpen != '[') return false;
            }
        }

        // If everything matched, the stack should be empty
        return openBrackets.isEmpty();
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Check if brackets match in your text");
        System.out.print("Enter some text with brackets: ");
        String input = keyboard.nextLine();

        // Show the result based on the check
        if (matchingBrackets(input)) {
            System.out.println("All brackets are properly matched");
        } else {
            System.out.println("Brackets don't match properly");
        }

        keyboard.close();
    }
}
/*
 example#1:
 Enter some text with brackets: [2{5(16+4)-3}]
 All brackets are properly matched

 example#2:
 Enter some text with brackets: [2{5(16+4}-3])
 Brackets don't match properly

*/