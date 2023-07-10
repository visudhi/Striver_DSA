//Vectors in java continued...
import java.util.*;

public class pgm2 {
    public static void main(String[] args) {
        Vector x1 = new Vector();
        x1.add("Creation");
        x1.add("Is");
        x1.add("Still");
        Object[] x=x1.toArray();
        System.out.println(Arrays.toString(x));// To override string method to print x
        System.out.println(x.getClass().getSimpleName());// To Check Type of x

        System.out.println("========================");



        int[] y={1,2,3};
        Object[] z= new Object[y.length];
        Vector x3 = new Vector(Arrays.asList(z));
        System.out.println(x3.size());
        System.out.println(x3.capacity());

        System.out.println("========================");

        //Vector is useful in multi threading, Data is increased exponentially

    }
}
