import java.util.*;
import java.io.*;
import java.lang.*;

public class euler12
{
	static int factor(int n)
	{
		int total=1;
		boolean[] sieve=new boolean[n+1];
		Arrays.fill(sieve,true);
		for(int i=2;i*i<=n;i++)
		{
			if(sieve[i])
			{
				for(int j=i*i;j<=n;j+=i)
					sieve[j]=false;
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(sieve[i])
			{
				int count=0;
				while(n%i==0)
				{
					count++;
					n/=i;
				}
				total=total*(count+1);
			}
		}
		return total;
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int[][] arr=new int[1000001][2];
		int temp=0,box=0;
		for(int i=1;i<=1000000;i++)
		{
			if(temp<=i)
			{
				box++;
				temp=factor((box*(box+1))/2);
			}
			arr[i][0]=(box*(box+1))/2;
			arr[i][1]=temp;
		}	
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			for(int i=1;i<=1000000;i++)
			{
				if(arr[i][1]>n)
				{
					System.out.println(arr[i][0]);
					break;
				}
			}
		}
	}
}