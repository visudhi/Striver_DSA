//Map interface continued
import java.util.*;

public class pgm4 {
    public static void main(String[] args) {
        Map<String,Integer> y= new HashMap<String,Integer>();
        y.put("a",1);
        y.put("bn",2);
        y.put("bn",3);
        

        System.out.println(y.containsKey("bn"));
        System.out.println("------------------------");
        System.out.println(y.containsValue(2));
        System.out.println("------------------------");
        // EntrySet Method
        System.out.println("The set is "+y.entrySet()); 
        System.out.println("------------------------");
        System.out.println();
        
        Map<String,Integer> y1= new HashMap<String,Integer>();
        y1.put("a",1);
        y1.put("bn",2);
        y1.put("bn",3);

        //Equals Method
        System.out.println("Is map1 equal to map2 ? "+y.equals(y1));

        System.out.println("------------------------");

        Map<Integer,String> y2= new HashMap<Integer,String>();

        y2.put(1,"a");
        y2.put(2, "b");

        //Get  Method

        System.out.println(y1.get("a"));// To get the value of  key "a"
        System.out.println();
        System.out.println(y2.get(1));//  To get value of a key 1


    }
}
