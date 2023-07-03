public class pgm11 {

    static void pattern(int n){

        int start=0;

    for(int i=0;i<n;i++)
    {
        if(i%2==0)
            {
                start=1;
            }
            else
            {
                start=0;
            }
        for(int j=i;j>=0;j--)  
        {
            

            System.out.print(start);
            start=1-start;
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }

}