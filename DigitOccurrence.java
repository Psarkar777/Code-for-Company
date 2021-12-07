/*
* Write an algorithm to find the number of occurrences of needle in a given positive number haystack

Input

The first line of the input consists of an integer needle, representing a digit.

The second line consists of an integer haystack, representing the positive number.

Output

Print an integer representing the number of occurrences of needle in haystack

Example
Input:

2
123228

Output:

3
* */


package CompanyCoding;

import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        while(n!=0) {
            int temp = n%10;
            if(temp == a) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
