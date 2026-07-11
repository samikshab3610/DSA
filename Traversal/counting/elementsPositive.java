package Traversal.counting;
//Check whether all elements are positive.

public class elementsPositive {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,4,-5,6};
        boolean isPositive = true;

        for(int i = 0; i <arr.length; i++){
            if(arr[i]>0){
                isPositive = false;
                break;
            }
        }
        System.out.println("Array is positive is "+isPositive);
    }
}
