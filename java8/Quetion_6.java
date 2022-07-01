package com.yash.assign;

import java.util.ArrayList;
import java.util.List;

public class Quetion_6 {

	public static void main(String[] args) 
	{
		List<Item> ilist= new ArrayList<Item>();
		ilist.add(new Item(1,"Shirt",600));
		ilist.add(new Item(2,"T-Shirt",500));
		ilist.add(new Item(3,"Top",800));
		ilist.add(new Item(4,"Jeans",1000));
		ilist.add(new Item(5,"Cap",200));
		
		int sum=0;
		for(Item t:ilist)
		{
			sum=sum+t.itemprice;
		}
		int avg=sum/ilist.size();
		System.out.println("Average price:"+avg);
		ilist.stream().filte((t->t.itemprice(avg)).forEach(System.out::println);
		System.out.println("--------------");
		ilist.stream().filter((a->a.itemprice%2==0)).forEach(System.out::println);
	}

}
