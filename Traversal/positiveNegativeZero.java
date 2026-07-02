package Traversal;

public class positiveNegativeZero {
    public static void main(String[] args) {
        int arr[] = {2, -8,  0, 3, 6, -1, -5, -9, 0};

        int positive = 0;
        int negative = 0 ;
        int zero = 0; 

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                positive ++ ;
            }else if (arr[i] < 0) {
                negative ++;
            } else {
                zero ++ ;
            }
        }
        System.out.println("positive: "+positive+ ", negative: "+negative+", zero:"+zero);
    }
}
