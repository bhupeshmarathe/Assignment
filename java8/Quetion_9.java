package com.yash.assign;

import java.util.function.Predicate;
public class Quetion_9 {

	public static void main(String[] args)
	{
		Predicate<Integer> p=i-> i%2==0;
		int even=0, odd=0;
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		for(int n:num)
		{
			if(p.test(n))
			{
				even++;
			}
			else
				odd++;
		}
		System.out.println("even count:"+even);
		System.out.println("odd"+ "count"+odd);
	}

}
