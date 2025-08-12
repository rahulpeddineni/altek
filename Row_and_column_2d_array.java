package array;

import java.util.Scanner;

public class Row_and_column_2d_array {
public static void main (String [] kk)
{
	Scanner x=new Scanner (System.in);
	int i,j,r,c;
	System.out.println("enter row and column size");
	r=x.nextInt();
	c=x.nextInt();
	int [][] a=new int [r][c];
	System.out.println("enter 8 integers elements");
	for (i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			a[i][j]=x.nextInt();
		}
	}
	System.out.println("stored element of 2d array");
	for (i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		  System.out.println(a[i][j]+" ");
		}
	}
}	
}
