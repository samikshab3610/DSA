package Traversal;
import java.util.*;

public class palindromebyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number; 
        int rev = 0;

        while(number>0){
            int digit = number % 10;
            rev = rev*10+digit;
            number /= 10;
        }
        if (rev == temp) {
            number = temp;
            System.out.println(number+" is palindrome");
        }else{
            number = temp;
            System.out.println(number+" is not palindrome");
        }

        sc.close();
    }
}
