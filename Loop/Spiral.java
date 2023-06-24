package Loop;

import java.util.Scanner;

/**
 * Spiral
 */
public class Spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int row = sc.nextInt();
        System.out.print("Enter col number : ");
        int col = sc.nextInt();
        int[][] spiralMatrix = new int[row][col];
        System.out.print("Enter element in cell : ");
        for (int i=0 ;i<spiralMatrix.length;i++) {
            for (int j = 0; j < spiralMatrix.length; j++) {
                spiralMatrix[i][j]=sc.nextInt();
            }
        }
    System.out.println("**************************");
    int rowStart = 0;
    int rowEnd = row-1;
    int colStart = 0;
    int colEnd = col-1;

    while (rowStart<=rowEnd && colStart <= colEnd) {
    
        for(col = colStart ;col<=colEnd; col++){
                System.out.print(spiralMatrix[rowStart][col]+" ");
        }    

        rowStart++;    

        for (row=rowStart; row <=rowEnd; row++) {
                System.out.print(spiralMatrix[row][colEnd]+" ");
                
        }
        colEnd--;    

        for(col=colEnd;col>=colStart;col--){
                System.out.print(spiralMatrix[rowEnd][col]+" ");
        }        
        rowEnd--;    

        for (row=rowEnd; row>=rowStart; row--) {
                System.out.print(spiralMatrix[row][colStart]+" ");
                
        }
        colStart++;

        System.out.println();
    }
        sc.close();
        
    }
}