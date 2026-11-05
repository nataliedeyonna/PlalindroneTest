import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Palindrome: Reads the same from left to right or vice versa
        // Palindrome Example: a, aka, abba
        // Not palindrome: ab (ab != ba), abc (abc != cba)

        // Input value will be String
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        String str = Integer.toString(num);

        if (CheckPalindromeString(str)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        input.close();

//        String str = "abaaba";
//        System.out.println(str);
//        System.out.println("String length: " + str.length());
//        System.out.println("Character at 0 index: " + str.charAt(0));
//        System.out.println("Character at last index: " + str.charAt(str.length()-1));

//        String str = "Hello World";
//        System.out.println(str.substring(2));
//        System.out.println(str.substring(0,7));
//
//        String substr = str.substring(0,6);
//        System.out.println(substr.length());
//
//        substr = substr.trim();
//        System.out.println(substr.length());

        // Google: Recursive method for palindrome String test

    }

    // Define a recursive method that checks if a string is a palindrome string
    // Invoking from within a static method (main is a static method)
    public static boolean CheckPalindromeString (String str) {

        // Palindrome Example: a, aka, abba
        // Not palindrome: ab (ab != ba), abc (abc != cba)

        // Base case
        if(str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length()-1)) {
            return false;
        } else {
            return CheckPalindromeString(str.substring(1, str.length()-1));
        }
    }

    //    CheckPalindromeString(akaka)
    //    CheckPalindromeString(kak)
    //    CheckPalindromeString(a)


    // How can we know if a problem can be solved using recursion?
    // Looping aspect, need to break down
    // Key Idea: Observe if any repetitive nature in the input data. Repetitive indicates if the data
    // can be broken down into smaller data.
    // Guide us on how to break the given input data into smaller size

    // Base case: the answer for an input data is known. Possible base cases: 1+
    // Have to have at least one base case, otherwise recursion will not stop

    // How do we aggregate the results from each recursive call

    // Reversing a string: Add the value
    // Factorial calculation: multiply
    // Sum of digits of an integer value: 123 = 6, add the value returned by the recursive call

}