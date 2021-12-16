/*
Write a program to print all the LEADERS in the array.
An element is leader if it is greater than all the elements to its right side.

And the rightmost element is always a leader.
For example int the array {16, 19, 4, 3, 8, 3}, leaders are 19, 8 and 3?
 */

package Wipro;

import java.util.Scanner;

public class PrintLadders {
    public static void printLadders(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            int j;
            for(j=i+1;j<n;j++) {
                if(arr[i]<arr[j]) {
                    break;
                }
            }
            if(j==n) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        printLadders(arr, n);
    }
}
