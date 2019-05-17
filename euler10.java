import java.io.*;
import java.util.*;
import java.lang.*;

public class euler10
{
	static long seive(int k)
	{
		int l=2000000;
		boolean[] arr=new boolean[l+1];
		Arrays.fill(arr,false);
		arr[2]=true;
		arr[3]=true;
		for(int x=1;x*x<l;x++)
		{
			for(int y=1;y*y<l;y++)
			{
				int n=4*x*x+y*y;
				if(n<=l && (n%12==1 || n%12==5))
					arr[n]=true;
				n=3*x*x+y*y;
				if(n<=l && n%12==7)
					arr[n]=true;
				n=3*x*x-y*y;
				if(x>y && n<l && n%12==11)
					arr[n]=true;
			}
		}
		for(int i=5;i*i<=l;i++)
		{
			if(arr[i])
			{
				for(int j=i*i;j<=l;j+=i*i)
					arr[j]=false;
			}
		}
		long sum=0;
		long[] arr2=new long[l];
		for(int i=0;i<l;i++)
		{
			if(arr[i])
			{
				sum+=i;
			}
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