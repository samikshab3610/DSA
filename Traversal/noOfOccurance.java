package Traversal;

public class noOfOccurance {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,2,5,2,6,2,7,2,8,2,9};
        int count = 0;
        int target = 2;

        for(int i = 0; i <= arr.length-1; i++){
            if (target == arr[i]) {
                count ++ ;
            }
        }
        System.out.println("No of occurance is "+count);
    }
}
