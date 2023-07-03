public class pgm21 {

    static void pattern(int n){
    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");

            if(i!=0 && j>=0  && i!=n-1 && j!=n-1 && n%2!=0)
             {
                for(j=n%2;j<n-1;j++)
                {
                System.out.print("-");
                }

                if((j==n-1))
                {
                    j--;
                }
            }


            if(i!=0 && j>=0  && i!=n-1 && j!=n-1 && n%2==0)
             {
                for(j=n%2+1;j<n-1;j++)
                {
                System.out.print("-");
                }

                if((j==n-1))
                {
                    j--;
                }
            }
             }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=6;
        pattern(n);
    }
}
