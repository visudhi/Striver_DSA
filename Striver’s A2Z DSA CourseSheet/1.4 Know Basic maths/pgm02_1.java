public class pgm02_1 {
    public static void main(String[] args) {
        System.out.println(reverse(21002));
    }

   static int reverse(int n)
   {
    int rev=0,rem=0;
     while(n!=0)
    {
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
    
    }
    return rev;

   }

}
