public class pgm12 {
    static void pattern(int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(j+1);
            }

            // for(int j=n;j>0;j--)
            // {
            //     System.out.print(" ");
            // }

            // for(int j=i+1;j>0;j--)
            // {
            //     System.out.print(" ");
            // }

            for(int j=2*i;j>0;j--)
            {
                System.out.print(" ");
            }

             for(int j=n-i;j>0;j--)
            {
                System.out.print(j);
            }

             

            System.out.println();
            
        }

        
    }

        public static void main(String[] args) {
        int n=6;
        pattern(n);
    }
}


        /* code for left version of right angled triangle
         for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j>0;j--)
            {
                System.out.print(" ");
            }

           


            for(int j=i+1;j>0;j--)
            {
                System.out.print(j);
            }

            
            System.out.println();
        }
         */



/*
code for right version of right angled triangle
 for(int i=n;i>=0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(j+1);
            }

            for(int j=n-i-1;j>0;j--)
            {
                System.out.print(" ");
            }  

            System.out.println();

            
        }
 */