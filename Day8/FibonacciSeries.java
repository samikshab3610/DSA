package Day8;
import java.util.Scanner;

public class FibonacciSeries {

    public static void FibonacciSeries(int n){
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how much the elements should be there in the series: ");
        int n = sc.nextInt();
        FibonacciSeries(n);
        sc.close();
    }
}