import java.util.*;
import java.io.*;
import java.lang.*;

public class euler4
{
	int add(String s)
	{
		int l=s.length();
		for(int i=0;i<l/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1)) return 0;
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		euler4 run=new euler4();
		int[] a=new int[1000001];
		for(int i=100;i<=1000;i++)
		{
			for(int j=100;j<1000;j++)
			{
				int p=i*j;
				if(p>=101101)
				{
					int v=run.add(""+p);
					if(v==1)a[p]=1;
				}
			}
		}
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			for(int i=n-1;i>=101101;i--)
			{
				if(a[i]==1)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}