public class pgm07_1 {
    public static void main(String[] args) {
            int n=1;
            System.out.println(isPrime(n));
        }
    public static String isPrime(int num) {
        if(num==1)  return "NO";
		//Your code goes here
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return "NO";
                
            }


        }
        
        return "YES";
		
	}
}
