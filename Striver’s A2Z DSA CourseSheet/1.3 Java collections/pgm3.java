//Map Interface

import java.util.*;

public class pgm3 {
    public static void main(String[] args) {
        Map<Integer,String> x= new HashMap();
        x.put(1,"Abc");
        x.put(2,"BCD");
        System.out.println(x);

        System.out.println("----------------------");

        /*-------------------------------------------------------*/

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(10,"Sac");
        map.put(11, "bat");// This is not printed as the last val of key 11 is printed
        map.put(11, "wat");// This is not printed as the last val of key 11 is printed
        map.put(11, "num1");

        System.out.println("Initial Mappings are "+map);

        System.out.println("----------------------");
  

        //Applying map.containskey method

        System.out.println(map.containsKey(12));

        System.out.println("----------------------");

        System.out.println(map.containsKey(11));

        System.out.println("----------------------");

        System.out.println(map.containsKey(10));

        System.out.println("----------------------");

        System.out.println(map.containsKey("wat"));

        System.out.println("----------------------");

         //Applying map.clear() method
        map.clear();

        System.out.println("After using clear method "+map);

        System.out.println("----------------------");





        
    }
}

//Map contains a key , value pair
//Can't contain duplicate keys
// 1:1 rule for Key-value pair

