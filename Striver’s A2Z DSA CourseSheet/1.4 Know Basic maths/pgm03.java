/* GCD/ HCF (only 29 Test cases pass) */
public class pgm03 {

    public static void main(String[] args) {
        System.out.println(calcGCD(63, 45));
    }
    public static int calcGCD(int n, int m){
        // Write your code here.
        int gcd=0;
        //x=0;
        //y=0;
     
        for(int i=1;i<=Math.min(m, n);i++)  // dont take i<=n as m may be smaller  so code can take less iterations to find the solution
        {
            if(n%i==0 && m%i==0)
            gcd=i;
           
        }
        return gcd;

        // for(int j=1;j<=m;j++)
        // {
        //     if(m%j==0 && n%j==0)
        //     y=j;
        // }
        
        //  if(n%x==0 && m%x==0)
        // {
        //     gcd=x;
        // }

        // else if(n%y==0 && m%y==0)
        // {
        //     gcd=y;
        // }

        // else
        // {
        //     gcd=1;
        // }
    

    
    }
}




