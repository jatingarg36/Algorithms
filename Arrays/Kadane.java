
import java.util.*;
import java.lang.*;
import java.io.*;

class Kadane
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			int p;
			p=sc.nextInt();
			arr[i]=p;
		}
		int curr_sum=0,max_sum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			curr_sum+=arr[i];
			max_sum=Integer.max(curr_sum,max_sum);
			if(curr_sum<0)
			curr_sum=0;
		}
		System.out.println(max_sum);
			
		}
		
	}
