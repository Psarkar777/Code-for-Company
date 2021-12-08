/*

* * * * *
 *     *
  *   *
   * *
    *

 */

package CloudKaptan;

import java.util.Scanner;

public class InvertedTriangleHollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++) {
                int t = n-i+1;
                if(i==1 || j==1 || j==t) {
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
