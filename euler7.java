import java.util.*;
import java.io.*;
import java.lang.*;
<<<<<<< HEAD
public class euler7
{
	static int solve(long n)
	{
		int k=0;
		boolean[] arr=new boolean[2000001];
		Arrays.fill(arr,true);
		for(int i=2;i*i<=10000;i++)
		{
			if(arr[i]==true)
			{
				for(int p=i*i;p<=2000000;p+=i)
				{
					arr[p]=false;
				}
			}
		}
		for(int i=2;i<=2000000;i++)
		{
			if(arr[i]==true)
			{
				n--;
			}
			if(n==0)
			{
				k=i;
				break;
			}
		}
		return k;
=======

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
>>>>>>> 0ae485240b6c8becaba158eccc236a039ee0ebe8
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
<<<<<<< HEAD
		int t=read.nextInt();
		while(t-->0)
		{
			long n=read.nextInt();
			System.out.println(solve(n));
		}
=======
		euler7 run=new euler7();
		run.solve();
		System.out.println("d");
>>>>>>> 0ae485240b6c8becaba158eccc236a039ee0ebe8
	}
}