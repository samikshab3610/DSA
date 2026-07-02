package Traversal;

public class smallestNumber {
    public static void main(String[] args) {
        int arr[] = {20,67,11, 55, 8};
        int smallest = arr[0];

        for(int i =0; i<arr.length; i++){
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
