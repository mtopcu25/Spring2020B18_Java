package day29_Wrappper_ArrayList;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {

        ArrayList<String> shoppinglist = new ArrayList<>();
                    shoppinglist.add("Milk");
                    shoppinglist.add("Coffee");
                    shoppinglist.add("Bread");
                    shoppinglist.add("ToiletPaper");
                    shoppinglist.add("Eggs");

        System.out.println(shoppinglist);

      for(int i=0; i<4; i++){
          System.out.println(shoppinglist.get(i));
      }
        System.out.println("==============================================================");
      for(String each : shoppinglist){
          System.out.println(each);
      }

      int size = shoppinglist.size();

        System.out.println(size);

    }
}
