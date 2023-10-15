public class FindingPowerOfFactorialDivisor {
    public static void main(String[] args) {
        int n = 10;  // The number for which the factorial is calculated
        int k = 2;   // The divisor for which we want to find the power

        int result = factPow(n, k);  // Call the factPow method to calculate the power of 'k' in 'n!'

        System.out.println("The power of " + k + " in the factorial of " + n + " is: " + result);
    }

    // Method to find the power of a divisor 'k' in 'n!'
    static int factPow(int n, int k) {
        int res = 0;  // Initialize a result variable to store the power of 'k'

        // Use a loop to calculate the power of 'k' in 'n!'
        while (n > 0) {
            n /= k;  // Divide 'n' by 'k' and update 'n'
            res += n; // Add the updated 'n' to the result
        }

        return res;  // Return the power of 'k' in 'n!'
    }
}
