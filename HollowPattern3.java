/*

 *
 * *
 *   *
 *     *
 * * * * *

 */


package PatternQuestion;

import java.util.Scanner;

public class HollowPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(j==1 || i==n || j==i) {
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
