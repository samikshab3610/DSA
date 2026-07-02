package Day11;
import java.util.*;

public class twoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        
        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < columns; j++) {
               arr[i][j] = sc.nextInt();    
            }
        }

        //outputs
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
