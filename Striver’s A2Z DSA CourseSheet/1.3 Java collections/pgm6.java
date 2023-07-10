import java.util.*;
public class pgm6 {
    public static void main(String[] args) {
    Map<Integer,String> a1= new HashMap<Integer,String>();
    a1.put(1,"x");
    a1.put(2,"y");
    //Size method in java
    System.out.println(a1.size());
    System.out.println("------------------------");
    //Values Method in Java
    System.out.println(a1.values());

    System.out.println("------------------------");

    Map<String,Integer> a2= new HashMap<String,Integer>();
    a2.put("a",1);
    a2.put("b",2);
    a2.put("c",null);

    //getOrDefault method in java
    //System.out.println(a1.toString());
    int k= a2.getOrDefault("a",20);
    System.out.println(k);
    System.out.println("------------------------");

    //PutIfAbsent 
    a2.putIfAbsent("b", 20);
    a2.putIfAbsent("c", 20);

    System.out.println(a2);
    System.out.println("------------------------");

    }
}
