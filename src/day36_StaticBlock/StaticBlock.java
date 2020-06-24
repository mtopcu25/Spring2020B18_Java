package day36_StaticBlock;

public class StaticBlock {


    public static void main(String[] args) {
        method1(); //2
        System.out.println("Main method executed"); //3

        // static -

    }

    static{ // 1

     //   method1();
        System.out.println("static block executed");
        System.out.println("omer");

    }

    public static void method1(){
        System.out.println("Custom method executed");

    }






}
