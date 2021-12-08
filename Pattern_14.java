/*
A
BA
CBA
DCBA
EDCBA
 */

package PatternQuestion;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            int A = 65;
            for(int j=i;j>=1;j--) {
                System.out.print((char)(A+j-1));
            }
            System.out.println();
        }
    }
}
