import java.util.*;

public class Longest_Palindrome_Series_Present_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str, newStr, maxString = "";
        System.out.println("Enter any string :: ");
        str = sc.next().trim().toLowerCase(); // Read and clean the input string

        int len = str.length();
        ArrayList<String> subStrings = new ArrayList<>(); // Create an ArrayList to store palindrome substrings

        // Generate all possible substrings and check if they are palindromes
        for (int i = 0; i < len; i++) {
            newStr = "";
            for (int j = i; j < len; j++) {
                newStr += str.charAt(j);

                if (isPalin(newStr)) // Check if the substring is a palindrome
                    subStrings.add(newStr); // Add it to the list of palindrome substrings
            }
        }

        // Find the longest palindrome substring in the list
        for (int i = 0; i < subStrings.size(); i++) {
            if (maxString.length() < subStrings.get(i).length()) {
                maxString = subStrings.get(i);
            }
        }

        System.out.println("All palindrome substrings: " + subStrings);
        System.out.println("Longest palindrome substring: " + maxString);
        sc.close(); // Close the scanner
    }

    // Function to check if a string is a palindrome
    public static boolean isPalin(String x) {
        String rev = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            char c = x.charAt(i);
            rev += c;
        }
        return rev.equals(x); // Return true if the string is a palindrome, otherwise false
    }
}
