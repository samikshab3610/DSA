package Traversal.Inplace_modification;

// Replace all negative numbers with 0.

public class replaceNegative_Zero {
    public static void main(String[] args) {
        
        int arr[] = {3,7,-5,-6,9,0,-1,2,-4,8};

        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
