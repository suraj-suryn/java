package Loop;

import java.util.Scanner;

/**
 * Transapose
 */
public class Transapose {

    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        System.out.println("Enter row and column : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter element in cell : ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // Transpose of the Matrix 
        System.out.println("Transpose of the Matrix given martix : ");
        for (int j=0;j<m;j++){
            for (int i=0;i<n;i++){
                System.out.print(matrix[i][j]+" ");
            }                
            System.out.println();
        }

        
    }

}