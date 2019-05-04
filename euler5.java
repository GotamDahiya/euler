import java.io.*;
import java.util.*;
import java.lang.*;

public class euler5
{
	int solve(int i,int n)
	{
		int a=(int)(Math.log(n)/Math.log(i));
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		euler5 run=new euler5();
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			boolean[] arr=new boolean[n+1];
			int[] k=new int[n+1];
			Arrays.fill(arr,true);
			Arrays.fill(k,0);
			int result=1;
			for(int i=2;i*i<=n;i++)
			{
				if(arr[i]==true)
				{
					for(int j=i*i;j<=n;j+=i)
						arr[j]=false;
				}
			}
			for(int i=2;i<=n;i++)
			{
				if(arr[i]==true)
				{
					k[i]=run.solve(i,n);
					//System.out.println(k[i]);
					result*=Math.pow(i,k[i]);
					//System.out.println(result);
				}
			}
			System.out.println(result);
		}	
	}
}