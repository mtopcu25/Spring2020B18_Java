package day17_WhileLoops;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class WhileLoopExample {

    public static void main(String[] args) {

        int apples = 10;

        while(apples>= 1){
            apples--;
            System.out.println("I'm Eating an apple and left: "+apples+" apples");

        }

        System.out.println("No have more apples :(");

        System.out.println("==========================================================");
        /*
        System.out.println("Enter a number");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int count = 1;

        while(count<=number){

            System.out.print(count+ ", ");
            count+=5;
                                  apples--;

        }
            */

        System.out.println("============================================================");

        Scanner scan = new Scanner(System.in);

        int total = 0;
        System.out.println("Enter a positive integer");
        int nextNum = scan.nextInt();

        while(nextNum>0){
            total = total+nextNum;
            nextNum = scan.nextInt();

        }
        System.out.println("Sum of all numbers "+total);
    }
}
