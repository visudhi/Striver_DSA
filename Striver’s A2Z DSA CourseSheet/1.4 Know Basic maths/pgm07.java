public class pgm07 {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }
    public static boolean isPrime(int num) {
		//Your code goes here

		
		
			for(int i=2;i<Math.sqrt(num);i++)
			{
				while(num%i==0)
				{
					return false;
				}

			}
            if(num==1)  return false;
		

		return true;
}
}
