public class pgm6 {

    static void pattern(int n){
       for(int i=n;i>=0;i--)
       {
        for(int j=0;j<i;j++)
        {
            System.out.print(j+1);
            
        }
        System.out.println();
       }
    
        
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }
}































































/*
 for(int i=0;i<=n;i++)
        {
            
            for(int j=n;i<=j;j--)
            {
                System.out.print(i+1);
                
            }
            System.out.println();
        }
 */