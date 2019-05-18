import java.io.*;
import java.util.*;
import java.lang.*;

public class euler12a
{
	static int factor(int n)
	{
		int count=0;
		if(n==1)
			return 1;
		for(int i=1;i<Math.ceil(Math.sqrt(n));i++)
		{
			if(n%i==0)
				count+=2;
		}
		if(Math.ceil(Math.sqrt(n))==Math.floor(Math.sqrt(n)))
			count++;

		return count;
	}
	public static void main(String[] args) 
	{
		int[][] arr=new int[1000001][2];
		for(int i=1;i<=1000000;i++)
		{
			arr[i][0]=(i*(i+1))/2;
			arr[i][1]=factor(arr[i][0]);
		}

		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		while(t-->0)
		{
			int n=read.nextInt();
			for(int i=1;i<=1000000;i++)
			{
				if(arr[i][1]>n)
				{
					System.out.println(arr[i][0]);
					break;
				}
			}
		}
	}
}