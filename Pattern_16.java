package PatternQuestion;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "KNOW";
        int n = str.length();
        int x=0;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++) {
            for(int j=i;j<n;j++) {
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
