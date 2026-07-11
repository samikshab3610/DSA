package Traversal.counting;

// Count elements greater than a given number X
public class elementsGreaterthanx {
    public static void main(String[] args) {
        int number = 7;
        int count = 0;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] > number){
                count ++;
            }
        }
        System.out.print(count);
    }
}
