import java.io.*;
import java.util.*;
import java.lang.*;
public class euler9
{
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			int max=-1;
			for(int a=1;a<n/3;a++)
			{
				int b=(n*n-2*a*n)/(2*(n-a));
				int c=n-a-b;
				int temp=-1;
				if((a*a+b*b)==c*c)
					temp=a*b*c;
				if(temp>=max)
					max=temp;
			}
			System.out.println(max);
		}	
	}
}