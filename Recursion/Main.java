/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // System.out.printf("%.0f", fact(5));
        System.out.printf("%.0f", fib(10));

    }
    
    private static double fact(int n) {
        if (n == 0) {
            // Base case
            return 1;
        } else {
            // Recursive case
            return n * fact(n - 1);
        }
    }
    
    private static double fib(int n) {
        // Fibanachi
        // N_n = N_n-1 + N_n-2
        if (n == 1 || n == 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    private static int binarySearch(int[] haystack, int needle, int front, int back) {
        int index = 0;


        return index;
    }
}