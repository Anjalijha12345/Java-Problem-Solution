import java.util.Scanner;

public class CompositeMagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = in.nextInt();

        System.out.print("Enter n: ");
        int n = in.nextInt();
        in.close();

        if (m < 1 || n < 1 || m > n) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("The composite magic numbers are:");
        int count = 0; // Initialize a count to keep track of the number of composite magic numbers
        for (int i = m; i <= n; i++) {

            boolean isComposite = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isComposite = true; // If 'i' is divisible by any number between 2 and 'i-1', it's composite
                    break;
                }
            }

            if (isComposite && i != 1) { // Check if 'i' is a composite number (excluding 1)
                int num = i;
                while (num > 9) {
                    int sum = 0;
                    while (num != 0) {
                        int d = num % 10;
                        num /= 10;
                        sum += d; // Calculate the sum of the digits
                    }
                    num = sum; // Update 'num' with the sum of its digits
                }

                if (num == 1) { // If 'num' becomes 1 after the digit sum process, it's a magic number
                    count++; // Increment the count
                    System.out.print(i + " "); // Print the composite magic number
                }
            }
        }
        System.out.println();
        System.out.println("Frequency of composite magic numbers: " + count); // Print the count of composite magic numbers
    }
}
