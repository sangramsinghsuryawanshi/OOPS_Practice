package PractOOPS;

import java.util.Scanner;

public class PrintSumUntilGetSingleDigitSum 
{
	public PrintSumUntilGetSingleDigitSum()
	{
		this.digitSum();
	}
	public void digitSum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		int rem =0,sum=0;
		for(int t=n;t!=0;t=t/10)
		{
			rem=t%10;
			sum+=rem;
		}
		System.out.println("Given sum of n digit is: "+sum);
		int sum1=0,sum2=0;
		for(int t=sum;t!=0;t=t/10)
		{
			rem=t%10;
			sum1+=rem;
		}
		if(sum1>=10)
		{
			for(int t1=sum1;t1!=0;t1=t1/10)
			{
				rem=t1%10;
				sum2+=rem;
			}
			System.out.println("Given sum of sum of n digit: "+sum2);
		}
		else
		{
			System.out.println("Given sum of sum of n digit: "+sum1);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintSumUntilGetSingleDigitSum s = new PrintSumUntilGetSingleDigitSum();
	}

}
