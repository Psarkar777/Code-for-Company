package CloudKaptan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintRepeatingCharacter {
    public static void repeatValue(String str) {
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
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if(count>1) {
                while(count!=0) {
                    System.out.print(entry.getKey());
                    count--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        repeatValue(str);
    }
}
