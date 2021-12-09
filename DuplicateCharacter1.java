// Write a program to print duplicate characters of a string maintain character order

// Input : Combination

// Output : oin

package String;

import java.util.Scanner;

public class DuplicateCharacter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length()-1;i++) {
            int count = 1;
            for(int j=i+1;j<str.length();j++) {
                if(ch[i]==ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }
            if(count > 1 && ch[i]!='0') {
                System.out.print(ch[i]);
            }
        }
    }
}
