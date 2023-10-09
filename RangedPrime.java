import java.util.*;
public class RangedPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound of the range: ");
        int l = sc.nextInt();
        System.out.println("Enter the upper bound of the range: ");
        int u = sc.nextInt();
        sc.close();
        System.out.println("Prime numbers between " + l + " and " + u);
        for (int i = l; i <= u; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        } 
    }
    static boolean isPrime(int prime) {
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
