import java.util.Scanner;
import java.util.Stack;

public class UseCase5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        // Pop characters to reverse
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
