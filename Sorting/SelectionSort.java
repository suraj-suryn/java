package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size elemnets : ");
        int n=sc.nextInt();
        int a[] =  new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        //Selection Sort: select the 1st element and compare with next element, find the smallest element pos,
        //then replace the element with thier postion
        
        
        for (int i = 0; i < a.length; i++) {
            int min = i; 
            for (int j = i+1; j < a.length; j++) {
                if (a[min]>a[j]) {
                   min = j;
                }
            }            
            int temp = a[min];
            a[min]=a[i];
            a[i]=temp;
        }

        System.out.print("Sorted elements of array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }        
        sc.close();
    }
}
