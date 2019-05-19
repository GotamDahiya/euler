import java.io.*;
import java.util.*;
import java.lang.*;

public class euler14
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			int[] cache=new int[n+1];
			long max=0,result=0;
			int s=0;
			for(int i=0;i<cache.length;i++)
				cache[i]=-1;
			cache[1]=1;
			for(int i=2;i<=n;i++)
			{
				s=i;
				int c=0;
				while(s!=1 && s>=i)
				{
					if((s&i)==1)
						s=3*s+1;
					else s/=2;
					c++;
				}
				cache[i]=c+cache[s];
			}
			for(int i=1;i<=n;i++)
			{
				if(cache[i]>=max)
				{
					max=cache[i];
					result=i;
				}
			}
			System.out.println(result);
		}
	}
}