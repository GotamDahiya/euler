import java.io.*;
import java.util.*;
import java.lang.*;
public class euler2
{
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=read.nextLong();
			int f0=2;
			int f1=8;
			int f2=0;
			int sum=f0;
			while(f1<n)
			{
				sum+=f1;
				f2=4*f1+f0;
				f0=f1;
				f1=f2;
			}
			System.out.println(sum);
		}
	}
}