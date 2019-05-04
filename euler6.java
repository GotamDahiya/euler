import java.io.*;
import java.util.*;
import java.lang.*;

public class euler6
{
	double sumsquares(long n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=Math.pow(i,2);
		}
		return sum;
	}
	double squaressum(long n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		return Math.pow(sum,2);
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		euler6 run=new euler6();
		int t=read.nextInt();
		while(t-->0)
		{
			long n=read.nextLong();
			System.out.println((long)run.squaressum(n)-(long)run.sumsquares(n));
		}	
	}
}