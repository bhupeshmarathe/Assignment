package com.yash.assign;

public class Quetion_15 {

	public static void main(String[] args) {
		
		int ar[]= {4,3,5,7,6,8,9,2};
		int count=0;
		for(int i=0;i<=ar.length-3;i++)
		{
			int a=ar[i]*ar[i];
			int b=ar[i+1]*ar[i+1];
			int c=ar[i+2]*ar[i+2];
			if(a==b+c || b==a+c || c==a+b)
			{
				count++;
			}
		}
		
		System.out.println("Combination of numbers satisfy pythagoras template are: "+count);

	}

}
