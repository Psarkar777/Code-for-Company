/*
* The first line of the input consists of an integer-numOfChem, representing the number of chemicals (N).

The second line consists of N space

separated integers-ener(), ener1,......,enerN

representing the energies

of the chemicals.

Output

Print an integer representing the sum of energy of the two chemicals which produces maximum energy on reaction.

Constraints

0$ numOfChem ≤ 105

-106 ≤ ener, ≤ 100

0 <= i <= numOfChem

Example

Input:

7

9 -3 8 -6 -7 8 10

Output:

19
* */

package CompanyCoding;

import java.util.Scanner;

public class MaxProductElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int maxProduct = 0;
        int sum=0;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                int p = arr[i]*arr[j];
                if(p>maxProduct) {
                    maxProduct = p;
                    sum = arr[i]+arr[j];
                }
            }
        }
        System.out.print(sum);
    }
}
