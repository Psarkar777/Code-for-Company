/*
    1
   232
  34543
 4567654
567898765

 */

package PatternQuestion;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            int x=i;
            for(int j=1;j<=i;j++) {
                System.out.print(x);
                x++;
            }
            x--;
            for(int j=1;j<i;j++) {
                x--;
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
