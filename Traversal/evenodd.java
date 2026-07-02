package Traversal;

public class evenodd {
    public static void main(String[] args) {
        int arr[] = {1,2,34,5,6,7,8,9,11,12,13,14,15};
        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                even ++;
            }else{
                odd ++ ;
            }
        }
        System.out.println("Even: "+even + " Odd: "+odd);
    }
}
