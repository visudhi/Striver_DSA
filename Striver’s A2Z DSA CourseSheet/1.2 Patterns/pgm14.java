public class pgm14 {

    public static void pattern(int n){

        for(int i=0;i<=n;i++)
        {
            for(char ch= 'A'; ch<='A'+i;ch++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=3;
        pattern(n);
    }
}

/* 

**************************************************************

Another Way

public class pgm14 {

    public static void pattern(int n){

        int alphabet=65;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(alphabet+j)+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=3;
        pattern(n);
    }
}


*/

