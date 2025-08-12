package array;

import java.util.Scanner;

public class Biggest_smallest {
public static void main (String []kk)
{
	Scanner x=new Scanner (System.in);
	int i,b,s;
	int[] a=new int[500];
	System.out.println("enter no of elements to read "+"in to array");
	int n=x.nextInt();
	System.out.println("enter any "+n+" integers elements");
	for(i=0;i<n;i++)
	{
		a[i]=x.nextInt();
	}
	b=a[0];
	s=a[0];
	for(i=1 ;i < n;i++)
	{
		if(a[i]>b)
		{
			b=a[i];
		}
		if(a[i]<s)
		{
			s=a[i];
		}
	}
	System.out.println(" biggest number is "+ b+"\n smallest number is " + s);
}
}
