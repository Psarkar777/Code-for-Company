package CloudKaptan;

import java.util.Scanner;

public class CheckUglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n%2==0) {
            n = n/2;
        }
        int flag=0;
        for(int i=3;i<=n;i+=2) {
            while(n%i==0) {
                n = n/i;
            }
            if(i>5) {
                flag = 1;
            }
        }
        if(flag==1) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }
}
