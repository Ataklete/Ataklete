package finalPack;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String str = "dad mom madam nurses run a nut for a jar of tuna";
        str = str.replaceAll("\\s", "");
        System.out.println(longPalindrome(str));
        System.out.println(isPalindrome("madam"));
        String str2 = "dad mom madam nurses run a nut for a jar of tuna";
        for(String s: extractAllPalindromes(str2)){
            System.out.println(s);
        }
    }

    static int resultStart;
    static int resultLength;

    private static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }

    public static String[] extractAllPalindromes(String s){
        String ss=s.toLowerCase();
        String[] strings=ss.split("\\s+");
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < strings.length ; i++) {
            String temp="";
            for (int j = i; j < strings.length; j++) {
                temp=temp+" "+strings[j];
                if(isPalindrome(temp.replaceAll("\\s", "")))
                    stringList.add(temp);
            }

        }
        return stringList.toArray(new String[0]);
    }
    public static String longPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        for (int i = 0; i < len - 1; i++) {
            expandRange(s, i, i);
            expandRange(s, i, i + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private static void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}