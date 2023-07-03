public class pgm08 {
    static void pattern(int n){
    
    for(int i=n-1;i>=0;i--)
    {
        for(int j=n-i-1;j>0;j--)
        {
            System.out.print(" ");
        }

        for(int j=2*i+1;j>0;j--)
        {
            System.out.print("*");
        }

        for(int j=n-i-1;j>0;j--)
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
