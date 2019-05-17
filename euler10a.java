import java.io.*;
import java.util.*;
import java.lang.*;

public class euler10a
{
	static long seive(int k)
	{
		int l=1000000;
		boolean[] arr=new boolean[l+1];
		Arrays.fill(arr,true);
		for(int i=2;i*i<=l;i++)
		{
			if(arr[i])
			{
				for(int p=i*i;p<=l;p+=i)
					arr[p]=false;
			}
		}
		long sum=0;
		long[] arr2=new long[l+1];
		for(int i=2;i<=l;i++)
		{
			if(arr[i])
				sum+=i;
			arr2[i]=sum;
		}
		return arr2[k];
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			System.out.println(seive(n));
		}	
	}
}