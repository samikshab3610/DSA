package Day7;

import java.util.*;

public class functions {


    public static int sumOfTwoNumbers(int num1 , int num2){
        return num1+num2 ;
    }

    public static int multiplyTwoNumbers(int a, int b){
        return a*b;
    }

    public static void printMyName(String name){
        System.out.println("My name is " + name);
    }

    public static void factorial(int num){
        if (num < 0){
            System.out.println("WE CAN'T FIND THE FACTORIAL OF TWO NUMBERS");
            return;
        }

        int factorial = 1;
        for(int i = num; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factoria is "+factorial);

        return;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        
        
        // int result = sumOfTwoNumbers(num1, num2);
        // System.out.println(result);

        //printMyName(name);
        
        //System.out.println(multiplyTwoNumbers(a, b));
        
        
        // factorial function
        int num = sc.nextInt();
        factorial(num);




        
    }
}
