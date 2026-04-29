package Day7;

import java.util.*;



public class problem1 {



    
    public static void isPrime(int num){
        boolean isPrime = false;
        if (num  <= 1){
            isPrime = false;
        }else{
            for (int i = 2; i < num ; i++){
                if (num %i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }


    public static void main(String[] args) {
        // the number is prime or not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        isPrime(num);
        
    }

}
