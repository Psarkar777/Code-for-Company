/*
54321
 4321
  321
   21
    1
 */

package PatternQuestion;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--) {
            for(int j=i;j<=n-1;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
