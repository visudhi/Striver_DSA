public class pgm19 {
    static void pattern(int n){

        // for(int i=0;i<=n;i++)
        // {
            
        //     for(int j=0;j<n-i;j++)
        //     {
        //         System.out.print("*");
        //     }

        //     for(int j=n-i-1;j>=0;j--)
        //     {
        //         System.out.print("-");
        //     }
        //     System.out.println();
        // }

        for(int i=n;i>0;i--)
        {
            for(int j=n-1;j>=n-i;j--)
            {
                System.out.print( "*");
            }

             for(int j=n-i-1;j>=0;j--)
            {
                System.out.print("-");
            }

             for(int j=n-i-1;j>=0;j--)
            {
                System.out.print("-");
            }

            for(int j=n-1;j>=n-i;j--)
            {
                System.out.print( "*");
            }
            
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=n;j>=n-i;j--)
            {
                System.out.print( "*");
            }

             for(int j=n-i-1;j>0;j--)
            {
                System.out.print("-");
            }

             for(int j=n-i-1;j>0;j--)
            {
                System.out.print("-");
            }

            for(int j=n;j>=n-i;j--)
            {
                System.out.print( "*");
            }


            System.out.println();
        }

        // for(int i=n;i>0;i--)
        // {

        //     for(int j=n-i-1;j>=0;j--)
        //     {
        //         System.out.print("-");
        //     }

        //     for(int j=n-1;j>=n-i;j--)
        //     {
        //         System.out.print( "*");
        //     }
        //     System.out.println();
        // }

    }
    public static void main(String[] args) {
        int n=3;
        pattern(n);
    }
}
