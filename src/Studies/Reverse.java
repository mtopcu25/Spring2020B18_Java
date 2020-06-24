package Studies;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String s = scan.next();

        String reverse = "";

        for(int i =s.length()-1; i>=0; i--){
            reverse = reverse+s.charAt(i);

        }

        if(s==reverse){
            System.out.println(reverse+ " is a palindrome");
        }else{
            System.out.println( " is not a palindrome");
        }
    }
}
