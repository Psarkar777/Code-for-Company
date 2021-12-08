/*
0
10
101
0101
01010
 */

package PatternQuestion;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(k%2!=0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
                k++;
            }
            System.out.println();
        }
    }
}
