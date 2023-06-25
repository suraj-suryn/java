package Recursion;

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of fabonacci series : ");
        int n=sc.nextInt();        
        int arr[]=new int[n];
        arr[0]=0;arr[1]=1;
        System.out.print("Sum of fabonacci series number : ");
        arr = fabonacciSeries(arr,n,2);
        for (int i = 0;i<arr.length;++i)
                System.out.print(arr[i] + " ");

        sc.close();
    }
    //
    private static int[] fabonacciSeries(int[] arr, int n,int num) {

            if(num==n)
                return arr;
            
            arr[num]=arr[num-1]+arr[num-2];
            num=num+1;
            return fabonacciSeries(arr,n,num);
    
    }
}
