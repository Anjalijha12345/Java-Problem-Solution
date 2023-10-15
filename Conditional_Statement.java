import java.util.Scanner;

public class Conditional_Statement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();
        sc.close(); // Close the scanner to release resources

        double result = b * b - 4.0 * a * c; // Calculate the discriminant

        if (result > 0.0) {
            // If the discriminant is positive, there are two real roots
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            // If the discriminant is zero, there is one real root
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            // If the discriminant is negative, there are no real roots
            System.out.println("The equation has no real roots.");
        }
    }
}
