// Write a program to print first Non repeating character of string

package String;

import java.util.Scanner;

public class FirstNonRepeating_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean found = false;
        for(int i=0;i<str.length();i++) {
            found = true;
            for(int j=0;j<str.length();j++) {
                if(str.charAt(i) == str.charAt(j) && j!=i) {
                    found = false;
                    break;
                }
            }
            if(found) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
