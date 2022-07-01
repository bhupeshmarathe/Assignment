package com.yash.assign;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Quetion_1 {

	public static void main(String[] args) 
	{
		System.out.println("Enter marks to calculate average:");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int []arr=new int [num];
		System.out.println("Enter the marks:");
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the marks of subject "+(i+1));
			arr[i]=sc.nextInt();
		}
		IntStream streamofMarks=Arrays.stream(arr);
		OptionalDouble avgMarks=streamofMarks.average();
		System.out.println("Average of marks is:"+avgMarks);
	}

}
