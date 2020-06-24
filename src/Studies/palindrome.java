package Studies;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("please Say word lan");

        String input=scanner.next();

        System.out.println(Palindrome(input));

    }

    public static boolean Palindrome(String input){

        String reverse= "";

        for (int i=input.length()-1; i>=0; i--) {
            reverse+=input.charAt(i);

        }


        return reverse.equals(input);
    }
}
