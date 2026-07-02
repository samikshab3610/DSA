package Traversal;

public class maxNumber {
    public static void main(String[] args) {
        int arr[]= {14,6,1,3,0,};
        int largest = 0; 

        for (int i=0; i<arr.length; i++){
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
