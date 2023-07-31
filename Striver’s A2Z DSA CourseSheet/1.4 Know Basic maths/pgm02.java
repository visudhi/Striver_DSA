//Reverse a number
public class pgm02 {
    public static void main(String[] args) {
        int x=1534236469;
        System.out.println(reverse(x));
    }
public static int reverse(int x) {
        int rev=0,rem=0,res=0;
        while(x!=0)
        {
            rem=x%10;
            
            res=rev*10+rem;

            if((res-rem)/10 !=rev)  return 0;

            x=x/10;
            rev=res;
        }
        return rev;
    }
}

/* This is the simple code for reverse  but leetcode is asking extra constraints like revof 1534236469  which becomes 9646324351,
 which is out of signed 32 int range, it asks to return 0 in such a case which is not possible with below code
 ----------------------------
static int reverse(int n){
    int rev=0,rem=0;
     while(n!=0)
     {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        
     }
    return rev;
}

*/