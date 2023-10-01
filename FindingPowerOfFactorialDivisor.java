import java.util.*;

public class FindingPowerOfFactorialDivisor {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;

        int result = factPow(n, k);

        System.out.println("The power of " + k + " in the factorial of " + n + " is: " + result);
    }

    static int factPow(int n, int k) {
        int res = 0;
        while (n > 0) {
            n /= k;
            res += n;
        }
        return res;
    }
}
