package Day10;
import java.util.*;

public class array {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        // int size = sc.nextInt();
        // int num[] = new int[size];
        // for(int i=0 ; i<size; i++){
        //     num[i] = sc.nextInt();
        // }
        // for(int i=0; i<num.length; i++){
        //     System.out.print(num[i]+ " ");
        // }


        //take an arry as input from the user . search for a given number x and print the index at which it occurs
        int number = sc.nextInt();
        int arr[] = new int[number];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i =0; i < arr.length; i++){
            if( x == arr[i]){
                System.out.print(x + " is found at position "+ i);
            }
        }

        
        // int[] arr = new int[5];
        // arr[0] = 97;
        // arr[1] = 88;
        // arr[2] = 89;
        // arr[3] = 92;
        // arr[4] = 95;

        // for(int i =0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}
