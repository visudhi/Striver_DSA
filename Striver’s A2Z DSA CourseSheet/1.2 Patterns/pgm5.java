public class pgm5 {

    static void pattern(int n){
        //for(int i=0;i<n;i++)
        for(int i=0;i<n;i++)
        {
            // for(int j=0;j<i+1;j++)
            for(int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=6;
        pattern(n);
    }
}
