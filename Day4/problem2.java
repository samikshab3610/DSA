package Day4;
import java.util.*;

public class problem2 {
    public static void main(String[] args) {
     
        // Print the table of n numbers input by the user

        Scanner sc = new Scanner(System.in);
        System.out.print("Table of ");
        int n = sc.nextInt() ;

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(n+" * "+i+" = "+ n*i  );
        }
    }
}
