package Day4.Extra_Problems;

import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        //print all even numbers till n

        Scanner sc = new Scanner(System.in);
        System.out.println("Upto what you want the even numbers : ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i=i+2){
            System.out.print(i + " ");
        }

    }
}
