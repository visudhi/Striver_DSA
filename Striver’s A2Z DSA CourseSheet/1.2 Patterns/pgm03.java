public class pgm03 {

    static void pattern(int n){
    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)  //j<=i also works
            {
                System.out.print(1+j);  
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n);
        
    }

}
