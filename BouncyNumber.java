import java.util.Scanner;

public class BouncyNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        in.close();
        
        if (n < 100) {
            System.out.println(n + " is not a Bouncy Number.");
            return;  // If the number is less than 100, it cannot be a bouncy number, so exit the program.
        }
        
        int t = n;  // Create a temporary variable to keep the original number
        boolean isIncreasing = true, isDecreasing = true;
        
        int prev = t % 10;  // Initialize the previous digit with the last digit of the number
        while (t != 0) {
            int d = t % 10;  // Get the current digit from the right
            if (d > prev) {
                isIncreasing = false;  // If a digit is greater than the previous one, it's not increasing
                break;  // No need to check further, exit the loop
            }
            prev = d;  // Update the previous digit
            t /= 10;  // Remove the last digit from the number
        }
        
        t = n;  // Reset the temporary variable
        prev = t % 10;  // Initialize the previous digit again
        while (t != 0) {
            int d = t % 10;  // Get the current digit from the right
            if (d < prev) {
                isDecreasing = false;  // If a digit is less than the previous one, it's not decreasing
                break;  // No need to check further, exit the loop
            }
            prev = d;  // Update the previous digit
            t /= 10;  // Remove the last digit from the number
        }
        
        if (!isIncreasing && !isDecreasing)
            System.out.println(n + " is a Bouncy Number.");
        else
            System.out.println(n + " is not a Bouncy Number.");
    }
}
