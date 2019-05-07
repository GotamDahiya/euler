import java.util.*;
import java.io.*;
import java.lang.*;

public class euler7
{
	void solve()
	{
		int l=10000;
		boolean[] sieve=new boolean[l];
		Arrays.fill(sieve,false);
		int result=-1;
		for(int x=1;x*x<l;x++)
		{
			for(int y=1;y*y<l;y++)
			{
				int n=(4*x*x)+(y*y);
				if(n<=l && (n%12==1 || n%12==5))
					sieve[n]=true;

				n=(3*x*x)+(y*y);
				if(n<=l && n%12==7)
					sieve[n]=true;
				n=(3*x*x)-(y*y);
				if(x>y && n<=l && n%12==11)
					sieve[n]=true;
			}
		}
		System.out.println("a");
		for(int i=5;i*i<l;i++)
		{
			if(sieve[i])
			{
				for(int j=i*i;j<l;j+=i*i)
					sieve[i]=false;
			}
		}
		System.out.println("b");
		for(int i=1;i<l;i++)
		{
			if(sieve[i])
			{	
				System.out.print(i+" ");
			}
		}
		System.out.println("c");
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		euler7 run=new euler7();
		run.solve();
		System.out.println("d");
	}
}