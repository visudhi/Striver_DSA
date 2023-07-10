//Vectors in Java
import java.util.*;
class pgm1{
    public static void main(String[] args) {
        Vector x= new Vector();
        x.add("a");
        x.add("y");
        x.add(0,"a");
        System.out.println("Capacity: "+ x.capacity());
        System.out.println("Size:     "+ x.size());
        System.out.println(x);

         System.out.println("======================");

        //Adding elements in vector 2

        Vector x1= new Vector();
        x1.add("B");
        x1.add("D");
        x1.add("D");
        System.out.println(x1);

         System.out.println("======================");

        //TO add elements of 2 vectors, vector1 and vector2
        x.addAll( x1);
        System.out.println("elements of Vectors 1 and 2 "+x);

        System.out.println("======================");

        //TO add elements of 2 vectors but elements of vector2 first
        x.addAll(0,x1);
        System.out.println("adding elements of Vectors 1 and 2 but elements of vector 2 first "+x);

         System.out.println("======================");

         // To retrive an element from a particular Index from vector 2
         System.out.println("Getting the first element from Vector2 "+x1.get(0));

         System.out.println("======================");


         //To Check if Vector1 contains all elements of vector2
         System.out.println("DOes vector 1 contains all elements of vector 2? "+x.containsAll(x1));

         System.out.println("======================");

         //To get the index of a particular element
         System.out.println("What is the index of D? "+x1.indexOf("D"));

         System.out.println("======================");

         //If an element is repeated twice then if we use index of we get the first index
         //If an element is repeated twice to get the last index we use ?
         System.out.println("What is the last  index of D? "+x1.lastIndexOf("D"));

         System.out.println("======================");

         //To get the first element in a vector
         System.out.println("What is the first element in vector x1: "+x1.firstElement());

         System.out.println("======================");
        
         //To get the last element in a vector
         System.out.println("What is the last element in vector x1: "+x1.lastElement());

         System.out.println("======================");
    }
}