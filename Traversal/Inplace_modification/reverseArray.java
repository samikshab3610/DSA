package Traversal.Inplace_modification;

//Reverse an array without using another array.


public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,9,6,5,0,4};

        for(int i = arr.length-1 ; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
