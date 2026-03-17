import java.util.Scanner;

public class UseCase10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string: remove spaces & convert to lowercase
        String str = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}