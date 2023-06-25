package Recursion;

import java.util.Scanner;

public class lognPowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and Exponenet : ");
        int n=sc.nextInt(),p=sc.nextInt();
        int ans=powerofnumber(n, p);
        System.out.print(n+" to the power "+p+ " = "+ans);
        

        sc.close();
    }

    private static int powerofnumber(int n, int p) {
        if(n==0)
            return 0;
        if(p==0)
            return 1;
        else if (p%2==0) {
            return powerofnumber(n, p/2)*powerofnumber(n, p/2);
        }else{
            return powerofnumber(n, p/2)*powerofnumber(n, p/2)*n;
        }
    }
}
