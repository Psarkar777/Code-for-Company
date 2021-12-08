/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */

package PatternQuestion;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print((char)(65+j-1));
            }
            for(int j=i;j>1;j--) {
                System.out.print((char)(65+j-2));
            }
            System.out.println();
        }
    }
}
