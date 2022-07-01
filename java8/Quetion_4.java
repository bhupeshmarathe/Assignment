package com.yash.assign;

import java.util.*;
import java.util.Comparator;
  
public class Quetion_4  {
  
    public static void main(String[] args)
    {
    	  List<Integer> list = Arrays.asList(10,17,25,20,15);
    	  
          System.out.print("The maximum value is : ");
    
          Integer var = list.stream().max(Integer::compare).get();
    
          System.out.print(var);
      }
  }
  
