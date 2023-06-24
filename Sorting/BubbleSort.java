package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0 ;i<n;i++){
            a[i]=sc.nextInt();
        }

        //Bubble sorting : it is the simple sorting based on ascending amd dscensing order.  
        
        System.out.print(" Ascending Order bubble sort : ");
        BubbleAscendingSortArray(a);
        System.out.println();
        System.out.print(" Dscending Order bubble sort : ");
        BubbleDscendingSortArray(a);
    }

private static void BubbleDscendingSortArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length-i-1; j++) {
            //this sorting based on ascending order.
            if (a[j]<a[j+1]) {
                int temp = a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
    }

    for (int i = 0; i < a.length; i++)
        System.out.print(a[i]+" ");
}


public static void BubbleAscendingSortArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                //this sorting based on ascending order.
                if (a[j]>a[j+1]) {
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i = 0; i < a.length ; i++)
            System.out.print(a[i]+" ");
    }
}
