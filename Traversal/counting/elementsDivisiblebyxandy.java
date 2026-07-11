package Traversal.counting;
// Count how many elements are divisible by 2 and 5.

public class elementsDivisiblebyxandy {
     public static void main(String[] args) {
        int count = 0;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]%2 == 0 && arr[i]%5 == 0){
                count ++;
            }
        }
        System.out.print(count);
    }
}
