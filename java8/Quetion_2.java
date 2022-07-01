package com.yash.assign;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quetion_2 {

	public static void main(String[] args) {
	
		List<Integer> marks = new ArrayList<Integer>();
		
		marks.add(60);
		marks.add(70);
		marks.add(80);
		marks.add(70);
		marks.add(60);
		marks.add(90);
		
		List<Integer> distmarks= marks.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct marks from the list are:");
		
		for (int i = 0; i < distmarks.size(); ++i) {
            System.out.println(distmarks.get(i));
          
		}
	}
}

