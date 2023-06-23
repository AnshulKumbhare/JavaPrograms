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

        System.out.println(new Palindrome().isPalindromeLogic1(inputString));

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

    }
}
