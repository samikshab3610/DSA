package Traversal.traversal_array;

//Print every second element.
public class everySecondElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i <= arr.length-1; i+=2) {
                System.out.print(arr[i]+" ");
        }
    }

}
