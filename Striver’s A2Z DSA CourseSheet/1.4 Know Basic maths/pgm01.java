import java.util.*;

public class pgm01 {
    public static void main(String[] args) {
        System.out.println(countDigits(999980));
    }
   
        public static int countDigits(int n){
            // Write your code here.
            
            int x=0,v=0;
            int temp=n;
            Set<Integer> x0= new HashSet<>();
            List<Integer> x1= new ArrayList<>();
            //Set<Integer> x11= new HashSet<>();
           
            while(n!=0)
            {
                x=n%10;
                //x1.add(x);
                x0.add(x); // removing x1.add(x) as set x0 can remove duplicates improving effeciency and reducing operations
                n=n/10;
            }
            
            x1.addAll(x0);//  Adding all the set elements to ArrayList x1

            System.out.println(x1);
            x1.removeAll(Collections.singleton(0));
            

            for(int i=0;i<x1.size();i++)
            {
                if(temp%x1.get(i)==0)
                {
                    ++v;
                }
            }

            if(v>=1)
            return v;

            else

            return 0;
            
        }
    }

