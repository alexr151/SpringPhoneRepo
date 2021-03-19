package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phone;
import dmacc.beans.User;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public User user() {
		User me = new User();
		
		me.setfName("Alex");
		me.setlName("Ryberg");
		me.setAge("23");
		
		return me;
	}
	
	@Bean
	public Phone phone() {
		
		Phone myPhone = new Phone();
		myPhone.setBrand("Apple");
		myPhone.setModel("iPhone X");
		myPhone.setProvider("AT&T");
		myPhone.setNumber("444-444-4444");
		
		return myPhone;
	}

}
