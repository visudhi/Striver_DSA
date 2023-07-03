public class pgm16 {
    static void pattern(int n)
    {
        char temp='A';
        for(int i=0;i<n;i++)
        {
            
            for(char ch=temp;ch<=temp+i;ch++)
            {
                System.out.print(temp);
                
            }
            temp++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=3;
        pattern(n);
    }
}
