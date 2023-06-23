package Patterns;

import java.util.Scanner;

/**
 * Problem Statement: Check if given string is a palindrome or not
 * Return true if palindrome else return false
 *
 * Ex: ababa --> is a palindrome as if we read it from left --> right or right --> left it's the same
 *
 * Condition: Input should be provided through a console
 * */
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = sc.next();

        if(inputString.length() == 1){
            System.out.println("It's a single character string hence it will be bydefault palindrome");
        }else {
            System.out.println("Using reversal of String approach: " + new Palindrome().isPalindromeLogic1(inputString));
            System.out.println("Using Finding a mid of a String approach: " + new Palindrome().isPalindromeLogic2(inputString));
        }
    }

    boolean isPalindromeLogic1(String str){
        String revString = "";

        int size = str.length();

        for(int i=size-1; i>=0; i--){
           revString = revString.concat( String.valueOf(str.charAt(i)));
        }

        if(revString.equals(str)){
            return true;
        }

        return false;
    }

    boolean isPalindromeLogic2(String str){
        int size = str.length();
        int left = 0;
        int right = 0;
        // If length of a string is odd
        if(size%2 != 0){
            int mid = size/2;
             left = mid -1;
             right = mid + 1;
        }else{
            int mid = size/2;
             left = mid-1;
             right = mid;
        }

        return compareChar(str, left, right);
    }

    boolean compareChar(String str, int left, int right){
        while(left != 0){
            if(str.charAt(left) == str.charAt(right)){
                left--;
                right++;
            }else{
                return false;
            }
        }

        return true;
    }
}
