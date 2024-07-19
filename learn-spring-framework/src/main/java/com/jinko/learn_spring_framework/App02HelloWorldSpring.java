package com.jinko.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. 스프링 컨텍스트를 실행
		var context = 
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2. 스프링 프레임워크가 관리하도록 설정 
		//HelloWorldConfiguration클래스를 @Configuration로 설정클래스로 지정
		//메서드에 @Bean를 설정함으로써 메서드에서 반환하는 객체를 스프링 프레임워크에서 Bean등록
		
		//3.스프링이 관리하는 Bean 검색
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		
	}

}
