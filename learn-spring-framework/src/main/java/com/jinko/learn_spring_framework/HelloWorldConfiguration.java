package com.jinko.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record는 JDK16에서 추가된 기능
//데이터와 관련된 필드만을 선언하면 자동으로
//생성자, 접근자, equals(), hashCode(), toString() 메서드가 생성됩니다.
record Person(String name, int age) {}

record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "jinko";
	}
	
	@Bean
	public int age() {
		return 26;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 14);
		return person;
	}
	
	@Bean
	public Address address() {
		return new Address("성북구 장위로 13길", "서울");
	}
	
}
