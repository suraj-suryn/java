package Recursion;

import java.util.Scanner;

public class nPowerOfNumber {
    public static int  powerOfNumber(int number,int expo) {
        if(expo==0)
            return 1;
        // 2^5
        //2*pow(2,e)2*16
        //2*pow(2,4)=2*8
        //2*pow(2,3)=2*4
        //2*pow(2,2)=2*2
        //2*pow(2,1)=2*1
        //2*pow(2,0)=1
        return number*powerOfNumber(number, expo-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int number = sc.nextInt();
        System.out.print("Enter exponent of the given number: ");
        int expon=sc.nextInt();
        System.out.println("The result is "+powerOfNumber(number,expon));
        sc.close();
    }
}
