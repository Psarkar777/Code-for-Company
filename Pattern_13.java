/*
A
AB
ABC
ABCD
ABCDE
 */

package PatternQuestion;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            int A = 65;
            for(int j=0;j<i;j++) {
                System.out.print((char)(A+j));
            }
            System.out.println();
        }
    }
}
