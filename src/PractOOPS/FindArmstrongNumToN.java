package PractOOPS;

import java.util.Scanner;

public class FindArmstrongNumToN 
{
	public void armstrongNNum(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			int rem=0,rev=0;
			for(int temp=a[i];temp!=0;temp=temp/10)
			{
				rem=temp%10;
				rev+=(rem*rem*rem);
			}
			if(rev==a[i])
			{
				System.out.println(rev+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		FindArmstrongNumToN f = new FindArmstrongNumToN();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("-------------------------------");
		int a[]=new int[size];
		System.out.print("Enter the array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("-------------------------------");
		f.armstrongNNum(a);
	}

}
