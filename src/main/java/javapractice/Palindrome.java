package javapractice;
import java.util.Scanner;

/*
Dada una oracion, indicar si es un palindromo
Given a sentence, show if it is a palindrome
*/

public class Palindrome {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert your sentence to check if it is a palindrome or not: ");
        String sentence = keyboard.nextLine();

        String cleanSentence = sentence.replaceAll("[^a-zA-Z]","").toLowerCase();
        boolean palindrome = isPalindrome(cleanSentence);
        
        if(palindrome){
            System.out.println("The sentence is a palindrome");
        }else{
            System.out.println("The sentence is not a palindrome");
        }        
    }
    
    public static boolean isPalindrome(String text){
        int left = 0;
        int right = text.length()-1;
        
        while(left < right){
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


