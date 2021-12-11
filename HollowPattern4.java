/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 */


package PatternQuestion;

import java.util.Scanner;

public class HollowPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=i;j<n;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                if(j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++) {
            for(int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++) {
                if(j==1 || j==n-i+1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
