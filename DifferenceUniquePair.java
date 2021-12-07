/*
* Problem Statement

Write a program that takes two integers P and Q and array A as input. P determines the size of array A Your program needs to print the count of unique pairs of elements of A that have a difference of Q between them. The program will take P and Q separated by space in the first line of input and the array elements separated by space in the second line of input

Sample Input 1

6 4
4 5 0 1 6 2

Sample Output 1

3
*/


package CompanyCoding;

import java.util.Scanner;

public class DifferenceUniquePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[p];
        for(int i=0;i<p;i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<p-1;i++) {
            for(int j=i+1;j<p;j++) {
                int sum = Math.abs(arr[i]-arr[j]);
                if(sum == q) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
