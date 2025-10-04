package chapter3;
import java.util.*;

public class Task4_Palindrome {
    public static void main(String[] args) {
        String word = "";
        System.out.println("Enter a word to check if Palindrome:");

        Scanner input = new Scanner(System.in);
        word = input.nextLine();
        
        //StringBuilder to create the reverse of the input string
        StringBuilder pl = new StringBuilder(word);
        String rev = pl.reverse().toString();

        //equals() method to compare input and reversed string
        if (word.equals(rev)) {
            System.out.println("The input string is a palindrome.");
        }
        else {
            System.out.println("The input string is NOT a palindrome.");
        }



    }
}
