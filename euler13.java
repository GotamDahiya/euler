import java.util.*;
import java.io.*;
import java.lang.*;

public class euler13
{
	static String sum(String[] num,int n)
	{
		int buffer=(int)Math.ceil(Math.log10(num.length));
		System.out.println(n+buffer);
		int length=n+buffer;
		long result=0;
		for (String i:num) 
		{
			result+=Long.parseLong(i.substring(0,length));
		}
		return String.valueOf(result);
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		read.nextLine();
		String[] num=new String[t];
		for(int i=0;i<t;i++)
		{
			num[i]=read.nextLine();
		}
		long time=System.nanoTime();
		String result=sum(num,10).substring(0,10);
		time=System.nanoTime()-time;
		System.out.println(result+" Time+ "+time);
	}
}