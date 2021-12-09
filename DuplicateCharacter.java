// Write a program to print duplicate characters of a string

// Input: Combination

// Output : ino

package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {
    public static void printDuplicate(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1) {
                System.out.print(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printDuplicate(str);
    }
}
