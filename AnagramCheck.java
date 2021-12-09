// Write a program to check two string are anagram are not

 /*Input: Sleep
          Slep
 */

// Output: Not Anagrams

package String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if(isAnagram(str1, str2)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}
