// Write a program to print first Non repeating character of string

// Using HashMap

package String;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeating {
    public static void firstNonRepeat(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character ch;
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);

            if(map.get(ch)==1) {
                System.out.println("First Non repeating character is: "+ch);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        firstNonRepeat(str);
    }
}
