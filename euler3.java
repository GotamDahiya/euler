import java.io.*;
import java.util.*;
import java.lang.*;

public class euler3
{
	long solve(long n)
	{
		long max=-1;
		while(n%2==0)
		{
			max=2;
			n>>=1;
		}
		for(int i=3;i<Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				max=i;
				n/=i;
			}
		}
		if(n>2)
			max=n;

		return max;
	}
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		euler3 run=new euler3();
		int t=read.nextInt();
		while(t-->0)
		{
			long n=read.nextLong();
			System.out.println(run.solve(n));
		}
		read.close();
	}
}