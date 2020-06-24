package day35_Static;

public class staticMethods {

    int a = 100; //insta=nce variable
    static int b = 200; //static variable
    static double c= 123.12; //static variable
    int x=123; //instance variable

    public static void main(String[] args) {
      // System.out.println(a); // static only accepts static

        staticMethods obj = new staticMethods(); // variables lari kullanabilecegi bir object

        System.out.println( obj.a ); //100

        System.out.println("==========================");


        System.out.println( b ); //200

        System.out.println(c); //123.12
        System.out.println(staticMethods.c);

        System.out.println(obj.c);


        System.out.println( staticMethods.b );
        System.out.println( obj.b );  //  prefers to be called through class name

        obj.x=321;

        System.out.println(obj.x);

        staticMethods obj2= new staticMethods();
        System.out.println(obj2.a);

        System.out.println(obj2.x);

        c=321.21;



        System.out.println(obj.c); //
        System.out.println(obj2.c);//
        System.out.println(c);



    }



    public void method(){
        System.out.println(a);
        System.out.println(b);
    }



}
