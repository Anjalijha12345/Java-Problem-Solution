import java.util.Scanner;

public class ArmstrongNumber {
    // Function to check if a number is an Armstrong number
    public int armstrong(int n) {
        int num = n, powerSum = 0;  // Initialize variables to store the number and the sum of powered digits
        String s = Integer.toString(n);  // Convert the number to a string to determine its length
        int l = s.length();  // Get the number of digits in the input number
        
        // Loop through each digit of the number
        while (num > 0) {
            int digit = num % 10;  // Get the last digit of the number
            powerSum = (int) (powerSum + (Math.pow(digit, l)));  // Add the powered digit to the sum
            num /= 10;  // Remove the last digit from the number
        }
        
        // Check if the sum of powered digits is equal to the original number
        if (powerSum == n)
            return 1;  // Return 1 if it's an Armstrong number
        else
            return 0;  // Return 0 if it's not an Armstrong number
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);  // Create a Scanner object for user input
        System.out.print("Enter Number: ");
        int num = in.nextInt();  // Read an integer from the user
        in.close();  // Close the input stream
        
        ArmstrongNumber obj = new ArmstrongNumber();  // Create an instance of the ArmstrongNumber class
        int r = obj.armstrong(num);  // Call the armstrong method to check if the number is an Armstrong number
        
        // Display the result to the user
        if (r == 1)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
