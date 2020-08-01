package Studies;

import java.util.Scanner;

public class Palindrome2 {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter any word here: ");
        String input = scan.next();

        palindrome(input);
    }
    public static void palindrome(String str){

        str = str.toLowerCase();
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        System.out.println(str.equals(reverse));

    }
}
