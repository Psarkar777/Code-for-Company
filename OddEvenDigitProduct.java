/*
Write an algorithm to find the discount

amount for the given total bill amount.

Input

The input consists of an integer billAmount,

representing the total bill amount of a

customer.

Output

Print an integer representing the discount amount for the given total bill.

Constraints

0 < billAmounts 10

Example

Input: 2514795

Output 162

Explanation:

Odd digits in the given number 2514795 are 5.1,7,9,5. The sum of these add digits is 27 Even digits in the given number 2514795 ace 2,4. The sum of these even digits &

So, the output in 162
*/


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
