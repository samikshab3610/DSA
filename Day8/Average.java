//Enter 3 numbers from the user & make a function to print their average.

package Day8;

import java.util.*;

public class Average {

    public static int average(int num1, int num2, int num3){

        int avg = (num1+num2+num3)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        System.out.println("Average of 3 numbers are "+average(num1, num2, num3));
    }
}
