package com.SpringCore.Quetion1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRole {
public static void main(String[] args) {
	ApplicationContext ctxobj= new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Role role= (Role) ctxobj.getBean("rolebean");
	role.show();		
}
}