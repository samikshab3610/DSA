package Day10;
import java.util.*;


public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        sc.nextLine(); // FIX

        String names[] = new String[size];

        for(int i=0; i < names.length; i++){
            System.out.print("Enter Name");
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+ " ");
        }

    }
}
