package array;

import java.util.Scanner;

public class Elements_of_2d_array 
{
	public static void main (String [] kk)
	{
		Scanner x=new Scanner (System.in);
		int i,j;
		int[][] a=new int [2][2];
		int[][] b=new int [2][4];
		System.out.println("enter 4 integers element to read integers a array");
		for (i=0; i < 2; i++)
		{
			for (j=0; j < 2; j++)
			{
			a[i][j]=x.nextInt();
			}
		}
		System.out.println("enter 8 integers element to read integers b array");
		for (i=0; i < 2; i++)
		{
			for (j=0; j < 4; j++)
			{
			b[i][j]=x.nextInt();
			}
		}
			System.out.println("a 2Darray stored elements");
			for (i=0; i < 2; i++)
			{
				for (j=0; j < 2; j++)
				{
				System.out.print(a[i][j]+"\t");
				}
				System.out.println(" ");
			}
			System.out.println("b 2Darray stored elements");
			for (i=0; i < 2; i++)
			{
				for (j=0; j < 4; j++)
				{
				System.out.print(b[i][j]+"\t");
				}
				System.out.println(" ");
			}
}		
}
			


