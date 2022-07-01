package com.yash.assign;

import java.util.Arrays;
import java.util.List;

public class Quetion_3 {

	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("Kamlesh","Bhupesh","Vishal","Mahendra","Bhupesh","Kamlesh");
		System.out.println("The distinct names of list are:");
		list.stream().distinct().forEach(System.out::println);

	}

}
