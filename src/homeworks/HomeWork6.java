package homeworks;

import com.sun.net.httpserver.SimpleFileServer;

public class HomeWork6 {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.print("Characters count: " + chars.length);
        System.out.println();
        System.out.print("First character: " + chars[0]);
        System.out.println();
        System.out.print("Last character: " + chars[chars.length - 1]);
        System.out.println();

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = 'a';
            if (c == chars[i]) {
                count++;
            }
        }
        System.out.print("Character 'a' count: " + count);
        System.out.println();

        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelsCount++;
            }
        }
        System.out.println("Vowels Count: " + vowelsCount);

        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            boolean isLetter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean isVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
            if (isLetter && !isVowel) {
                consonantsCount++;
            }
        }
        System.out.println("Consonant Counts: " + consonantsCount);

        int space = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                space++;
            }
        }
        System.out.println("Spaces count: " + space);

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();


        char[] chars1 = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
        // Uppercase
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'a' && chars1[i] <= 'z') {
                chars1[i] = (char) (chars1[i] - 32);
            }
        }

        System.out.print("Uppercase: ");
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i]);
        }

        // Lowercase
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'A' && chars1[i] <= 'Z') {
                chars1[i] = (char) (chars1[i] + 32);
            }
        }

        System.out.println();
        System.out.print("Lowercase: ");
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars1[i]);
        }
        System.out.println();


        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == oldChar) {
                chars1[i] = newChar;
            }
        }
        System.out.print(chars1);
        System.out.println();


        boolean palindrome = true;
        char[] chars2 = {'l', 'e', 'v', 'e', 'l'};
        for (int i = 0; i < chars2.length / 2; i++) {
            if (chars2[i] != chars2[chars2.length - 1 - i]) {
                palindrome = false;
            }
        }
        System.out.println("Palindrome is " + palindrome);

        //bonus 2
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};
        boolean equal = true;
        if (first.length != second.length) {
            equal = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    equal = false;
                }
            }
        }
        System.out.println("Arrays are equal: " + equal);
    }
}
