
import java.io.*;
import java.util.*;

class Solution {
  private static boolean isPalindrome( final String input ) {
    if(input.length()==0){
      return false;
    }
    String intput2 = input.replace(" ","");
    int length = intput2.length()-1;
    for (int i=0; i<length/2; i++){
      char frontChar =intput2.charAt(i);
      char backChar =intput2.charAt(length-i);

      if(frontChar!=backChar){
        return false;
      }
      
    }
    return true;
  }
  
  public static void main(String[] args) {

/*
 * 1) Write a function that returns true if a string is a palindrome
 *    - Palindrome: a word, phrase, or sequence that reads the same backward
 *      as forward, e.g., madam or nurses run.
 */
    System.out.println("nurses run -> " + isPalindrome("mam, dad ,nurses run"));
    System.out.println("kayak -> " + isPalindrome("kay       ak"));
    System.out.println("canucks -> " + isPalindrome("c      anucks"));
    
    
  }
}
