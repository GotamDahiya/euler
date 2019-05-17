import java.io.*;
import java.util.*;
import java.lang.*;
public class euler8
{
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			int k=read.nextInt();
			read.nextLine();
			String num=read.nextLine();
			int p=1;
			int max=0;
			for(int i=0;i<n-k;i++)
			{
				for(int j=0;j<k;j++)
				{
					char ch=num.charAt(i+j);
					int a=Integer.parseInt(String.valueOf(ch));
					p=p*a;
				}
				if(p>=max)
					max=p;
				p=1;
			}
			System.out.println(max);
		}	
	}
}