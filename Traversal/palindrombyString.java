package Traversal;
import java.util.*;

public class palindrombyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String rev = "";

        for(int i = str.length()-1 ; i >= 0; i--){
            rev = rev+ str.charAt(i);
        }
        System.out.println("Reverse = "+ rev);
        if(rev.equals(str)){
            System.out.println("is Palindrom");
        }
        else{
            System.out.println("is not palindrom");
        }

        sc.close();

    }
}
