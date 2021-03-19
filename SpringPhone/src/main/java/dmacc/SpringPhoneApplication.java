package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Phone;
import dmacc.beans.User;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

@SpringBootApplication
public class SpringPhoneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringPhoneApplication.class, args);
	}

	
	@Autowired
	PhoneRepository repo;
	
	public void run(String... args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		User u = appContext.getBean("user", User.class);
		u.setfName("Ashley");
		repo.save(u);
		
		//Creating bean w/o using Spring management
		User a = new User("Ashley", "Green", "23");
		Phone p = new Phone("Apple", "iPhone 12", "Sprint", "555-555-5555");
		
		a.setPhone(p);
		repo.save(a);
		
		List<User> allUsers = repo.findAll();
		for(User users : allUsers) {
			System.out.println(users.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
