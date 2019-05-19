import java.io.*;
import java.util.*;
import java.lang.*;

public class bit
{
	static int count(int n)
	{
		int c=0;
		while(n!=1)
		{
			if((n&1)==1)
				n=3*n+1;
			else n/=2;
			c++;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int[] arr=new int[100001];
		arr[1]=1;
		for(int i=2;i<=100000;i++)
		{
			arr[i]=count(i);
		}
		System.out.println("A");
		int t=read.nextInt();
		while(t-->0)
		{
			Long n=read.nextLong();
			int max=0,result=0;
			for(int i=1;i<=n;i++)
			{
				if(arr[i]>=max)
				{
					max=arr[i];
					result=i;
				}
			}
			System.out.println(result);
		}
	}
}