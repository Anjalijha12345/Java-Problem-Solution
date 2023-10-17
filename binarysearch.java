import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(int[] arr, int s, int e, int key) {
        // Base case
        if (s > e)
            return false;

        int mid = s + (e - s) / 2;

        if (arr[mid] == key)
            return true;

        if (arr[mid] > key) {
            return binarySearch(arr, s, mid - 1, key);
        } else {
            return binarySearch(arr, mid + 1, e, key);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int key = scanner.nextInt();

        boolean result = binarySearch(arr, 0, n - 1, key);
        System.out.println(result);
    }
}
