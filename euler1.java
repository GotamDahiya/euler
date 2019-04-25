import java.io.*;
import java.util.*;
import java.lang.*;

public class euler1
{
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=read.nextInt();
			int s=0;
			for(int j=1;j<n;j++)
			{
				if(j%3==0 || j%5==0)
					s+=j;
			}
			System.out.println(s);
		}	
	}
}