public class pgm18 {
    static void pattern(int n){

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)('A'+(n-i+j-1)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }
}
