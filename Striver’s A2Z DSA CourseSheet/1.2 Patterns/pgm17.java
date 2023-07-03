public class pgm17 {
    static void pattern(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j>0;j--)
            {
                System.out.print("*");
            }

            for(char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch);
            }

            for(int j=i-1;j>=0;j--)
            {
                System.out.print((char)('A'+j));
            }

            for(int j=n-i-1;j>0;j--)
            {
                System.out.print("*");
            }
            

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        pattern(n);
    }
}
