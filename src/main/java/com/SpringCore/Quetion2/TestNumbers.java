package com.SpringCore.Quetion2;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNumbers {

	public static void main(String[] args) {
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Numbers num = (Numbers) ctxobj.getBean("numbean1");
		
		
		List<Integer> numlist= num.numberlist;
		
		
	}

}
