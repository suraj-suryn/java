package Recursion;

public class FabonacciSeries2 {
     private static void printFabo(int i, int a, int b) {
        if (i == 0){
            return ;
        }else{
            int c= a+b;
            System.out.print(" "+c);
            printFabo(i-1, b, c);
        }
    }
    public static void main(String[] args) {
        int n = 10, a=0, b=1;
        System.out.print("Fabonacci Series for "+n+" number : "+a +" "+ b +" ");
        printFabo(n-2,a,b);
    }

   
}
