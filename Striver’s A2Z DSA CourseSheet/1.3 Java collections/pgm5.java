import java.util.*;

public class pgm5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");

        //Hashcode method in Map Interface
        System.out.println(map.hashCode());

        System.out.println("----------------");

        int hash=map.hashCode();

        System.out.println(hash);

        System.out.println("----------------");

        Map<String,String> map1= new HashMap<>();

        System.out.println(map1);

        System.out.println("----------------");

        //IsEmpty Method In Map interface
        System.out.println(map1.isEmpty());

        System.out.println("----------------");

        System.out.println(map.isEmpty());

        System.out.println("----------------");


        Map<Integer,String> x111= new HashMap<Integer,String>();
        x111.put(1,"x");
        x111.put(2,"y");

        //Keyset Method In java
        System.out.println(x111.keySet());

        System.out.println("----------------");

        //PutAll method in Map Interface

        Map<Integer,String> y11= new HashMap<Integer,String>();
        y11.put(3,"a");
        y11.put(4,"b");
        System.out.println(y11);
        

        System.out.println("----------------");
        
        Map<Integer,String> z11= new HashMap<Integer,String>();
        z11.put(3,"c");
        z11.put(4,"d");

        y11.putAll(z11);

        System.out.println("z11 "+z11);
        System.out.println("----------------");

        Map<Integer,String> s11= new HashMap<Integer,String>();
        s11.put(5,"c");
        s11.put(6,"d");

        z11.putAll(s11);
        System.out.println("z11 "+z11);
        System.out.println("----------------");

        System.out.println(s11);

        System.out.println("----------------");

        //Remove Method in Map Interface
        s11.remove(5);
        z11.remove(4);
        System.out.println(s11);
        System.out.println("----------------");
        System.out.println(z11);

        System.out.println("----------------");


    }
}
