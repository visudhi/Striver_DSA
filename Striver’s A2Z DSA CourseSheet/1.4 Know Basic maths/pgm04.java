import java.util.*;

public class pgm04 {
    public static void main(String[] args) {
        System.out.println(count(1232));
    }
    


	public static int count(int n){
		//Write your code here
		int x1=0,count=0;
		List<Integer> x= new ArrayList<>();
		while(n!=0)
		{
			x1=n%10;
			x.add(x1);
			n=n/10;
		}

		for(int i=0;i<x.size();i++)
		{
			count++;
		}
		return count;
		}


}

