//Find the maximum & minimum number in an array of integers. 

package Day10;
import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size] ; 

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array elemants: ");
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min) {
                min = arr[i];
            }

            if (arr[i]> max) {
               max = arr[i]; 
            }
        }
        System.out.println("Min: "+min +" Max: "+max);


    }
}
