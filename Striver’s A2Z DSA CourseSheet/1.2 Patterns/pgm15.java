// public class pgm15 {

//     static void pattern(int n){
//         for(int i=n;i>=0;i--)
//         {
//             for(char ch='A';ch<'A'+i;ch++)
//             {
//                 System.out.print(ch + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=6;
//         pattern(n);
//     }

// }

/*
 ******************************************************************
 Another Way

 public class pgm15 {

    static void pattern(int n){
        for(int i=n;i>=0;i--)
        {
            int alphabet=65;
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(alphabet +j)+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=3;
        pattern(n);
    }

}
*/