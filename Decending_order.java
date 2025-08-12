package array;

import java.util.Scanner;

public class Decending_order {
public static void main (String []kk)
{
	Scanner x=new Scanner (System.in);
	int n,i,j,zc;
	System.out.println("enter no of elements will you store");
	n=x.nextInt();
	int [] a=new int [n];
	System.out.println("enter "+n+" elements");
	for (i=0;i<n;i++)
	{
		a[i]=x.nextInt();
	}
		for (j=i+1;j<n;j++)
		{
			if (a[i] < a[j])
			{
				zc  =a[i];
				a[i]=a[j];
				a[j]=zc;
			}
		}
	
	for (i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}
