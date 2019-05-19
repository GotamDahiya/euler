import java.io.*;
import java.lang.*;
import java.util.*;

public class euler16
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			int result=0;
			long exp=(long)Math.pow(2,n);
			long a=exp;int c=0;
			while(a!=0)
			{
				c++;
				a/=10;
			}
			System.out.println(c);
			long[] arr=new long[c];
			while(exp!=0)
			{
				c--;
				arr[c]=exp%10;
				exp/=10;
			}
			for(int i=0;i<arr.length;i++)
			{
				result+=arr[i];
				System.out.print(arr[i]);
			}
			System.out.println("D");
			System.out.println(result);
		}
	}
}