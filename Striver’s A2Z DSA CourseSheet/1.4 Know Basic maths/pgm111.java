/*Count digit CN (Coding Ninjas website problem) */
import java.util.*;

public class pgm111 {
    public static void main(String[] args) {
        System.out.println(countDigits(980));
    }
   
        public static int countDigits(int n){
            // Write your code here.
            
            int x=0,v=0;
            int temp=n;
            List<Integer> x1= new ArrayList<>();
            //Set<Integer> x11= new HashSet<>();
           
            while(n!=0)
            {
                x=n%10;
                x1.add(x);
                n=n/10;
            }

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

