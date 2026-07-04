//Write a function which takes in 2 numbers and returns the greater of those two.

package Day8;
import java.util.*;

public class GreaterNumber {
    public static int greaterNumber(int num1, int num2){
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = greaterNumber(num1, num2);
        System.out.println(result + " is greater");
        sc.close();
    }
}
