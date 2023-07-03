public class pgm13 {
    static void pattern(int n)
    {
        int temp=1;
        for(int i=1;i<=n;i++)
        {       
             
               for(int j=1;j<i;j++)
               {
                // //if(i==n && j==0) 
                // if(i>2 || j<=n-i && j==0 )
                // {
                //     ++j;
                // } 
                
                // temp=i+j;
                
                System.out.print(temp);
                temp+=1;
                
                
                
               }

            System.out.println();
            // if(j<=i-1)
            // temp++; 
            
        }
    }
    public static void main(String[] args) {
        int n=4;
        pattern(n);
    }
}
