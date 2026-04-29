//Write a function which takes in 2 numbers and returns the greater of those two.

package Day8;
import java.util.*;

public class greaterNumber {
    public static void greaterNumber(int num1, int num2){
        if (num1<num2) {
            System.out.println(num2+" is greater");
        } else {
            System.out.println(num1+" is greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        greaterNumber(num1, num2);
    }
}
