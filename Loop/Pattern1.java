package Loop;

import java.util.Scanner;

/**
 * Pattern1
 */
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(num++);
            }
            System.out.println();
        }

        
    }
}