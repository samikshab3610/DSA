package Day4;
import java.util.*;


public class problem1 {
    public static void main(String[] args) {
        //print the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.err.println(sum);

    }
}
