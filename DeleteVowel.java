package Wipro;

import java.util.Scanner;

public class DeleteVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        String str2 = str1.replaceAll("[aeiouAEIOU]","");
        System.out.println("After deleting vowel the new string is: "+str2);
    }
}
