package com.amilcar.HelloAppOfSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amilcar.beans.Saludo;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/amilcar/xml/beans.xml");
		Saludo s = (Saludo) appContext.getBean("saludo");
	
		System.out.println(s.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
