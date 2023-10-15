import java.util.*;

class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i, c = 0;

        // Loop through numbers from 1 to 'n' to count how many factors 'n' has
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++; // If 'n' is divisible by 'i', increment the factor count 'c'
            }
        }

        if (c == 2) {
            // If 'n' has exactly 2 factors (1 and itself), it is a prime number
            System.out.println("The number is a prime number.");
        } else {
            // If 'n' has more than 2 factors, it is not a prime number
            System.out.println("The number is not a prime number.");
        }
    }
}
