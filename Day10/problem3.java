package Day10;
import java.util.*;


public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;
        //sorting
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i+1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
