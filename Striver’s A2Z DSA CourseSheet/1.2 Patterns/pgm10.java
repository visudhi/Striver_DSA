public class pgm10 {
    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                System.out.print("*");
            }

            for(int j=n-i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=n;i>0;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print("*");
            }

            for(int j=n-i-1;j>0;j--)  // sensibly it is n-i
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=6;
        pattern(n);
    }
}
