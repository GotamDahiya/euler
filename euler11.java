import java.io.*;
import java.util.*;
import java.lang.*;

public class euler11
{
	static int solve(int[][] grid)
	{
		int max=0,result;
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<23;j++)
			{
				if((j-3)>=0)
				{
					result=grid[i][j]*grid[i][j-1]*grid[i][j-2]*grid[i][j-3];
					if(result>max)
						max=result;
				}
				if((i-3)>=0)
				{
					result=grid[i][j]*grid[i-1][j]*grid[i-2][j]*grid[i-3][j];
					if(result>max)
						max=result;
				}
				if((i-3)>=0 && (j-3)>=0)
				{
					result=grid[i][j]*grid[i-1][j-1]*grid[i-2][j-2]*grid[i-3][j-3];
					if(result>max)
						max=result;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		int[][] grid=new int[26][23];
		for(int i=3;i<23;i++)
		{
			for(int j=3;j<23;j++)
			{
				grid[i][j]=read.nextInt();
			}
		}
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<=2;j++)
				grid[i][j]=0;
		}
		for(int j=0;j<23;j++)
		{
			grid[0][j]=grid[1][j]=grid[2][j]=grid[23][j]=grid[24][j]=grid[25][j]=0;
		}
		System.out.println(solve(grid));	
	}
} 