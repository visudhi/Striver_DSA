public class pgm7 {

    static void pattern(int n)
    {
        for(int i=0;i<n;i++)  //2,   1,2,3    ,   0,1,2,3,4
        {
            for(int j=n-i-1;j>0;j--)
            
            {
                System.out.print(" ");
            }
            
            for(int j1=(2*i)+1;j1>0;j1--)

            {
                System.out.print("*");
            }
            

            for(int j2=n-i-1;j2>0;j2--)
            {
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n);
        
    }
}

/*

     * 
   * * * 
 * * * * *


     2 
   1 2 3 
0  1 2 3 4 


 */