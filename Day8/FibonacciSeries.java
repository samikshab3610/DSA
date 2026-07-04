package Day8;
import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms to print: ");
        int n = sc.nextInt();
        printFibonacciSeries(n);
        sc.close();
    }
}