package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to claculate factorial : ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" : "+ factorial(n));
        sc.close();
    }
    private static int factorial(int number){
        if(number==1 || number== 0)
            return 1;        
        return number * factorial(number-1);
    }
}
