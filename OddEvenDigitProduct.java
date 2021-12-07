package CompanyCoding;

import java.util.Scanner;

public class OddEvenDigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum=0, oddSum=0;
        while (n!=0) {
            int temp = n%10;
            if(temp%2==0) {
               evenSum += temp;
            }
            else {
                oddSum += temp;
            }
            n /= 10;
        }
        System.out.println(evenSum*oddSum);
    }
}
