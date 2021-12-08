/*
1
01
010
1010
10101
 */

package PatternQuestion;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(k%2==0) {
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
