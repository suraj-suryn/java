package Sorting;

import java.util.Scanner;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter the element : ");
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++)
            arr[i]=sc.nextInt();
            
        //printing sorted elements in ascending order
        insertion_sort(arr,n-1);
        
        sc.close();
    }

    private static void insertion_sort(int[] arr, int n) {
        
        for (int i = 1; i < arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
           while (j>=0 && current< arr[j]) {
                arr[j+1] = arr[j];
                j--;
           }
           //placement
           arr[j+1]=current;
        }
        printArray(arr,"Sorted Array");
        
    }

    private static void printArray(int[] arr, String string) {
        System.out.println(string + " : ");
               for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}