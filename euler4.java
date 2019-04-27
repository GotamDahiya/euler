import java.util.*;
import java.io.*;
import java.lang.*;

public class euler4
{
	static long pallindrome(long a)
	{
		long sum=0;
		while(a!=0)
		{
			sum+=a%10;
			a/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		euler4 run=new euler4();
		int t=read.nextInt();
		while(t-->0)
		{
			long n=read.nextLong();
			long a=0,b=0;
			for(int i=100;i<1000;i++)
			{
				for(int j=i;j<1000;j++)
				{
					if(i*j<=n)
					{
						a=i*j;
						b=a;
						long sum=0;
						while(b!=0)
						{
							sum+=b%10;
							b/=10;
						}
						if(a==sum)
						{
							System.out.println(a);
							break;
						}
					}
				}
			}
		}	
	}
}