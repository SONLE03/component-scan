package com.example.spring;
import com.example.spring.animal2.Cat;
import com.example.spring.animal1.Dog;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
@SpringBootApplication
@ComponentScan("com.example.spring.animal1")
//@SpringBootApplication(scanBasePackages = "com.example.spring.animal2")
//@SpringBootApplication(scanBasePackages = {"com.example.spring.animal1", "com.example.spring.animal2"})
//@ComponentScan({"com.example.spring.animal1", "com.example.spring.animal2"})
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = {"com\\.example\\.spring\\.animal1..*","com\\.example\\.spring\\.animal2..*"}))
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {Fish.class, Dog.class}))
public class SpringApplication {
	public static void main(String[] args) {
		ApplicationContext context = org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
		try{
			Fish fish = context.getBean(Fish.class);
			System.out.println("Bean " + fish);
			fish.Fish();
		}catch (Exception ex){
			System.out.println("Bean Fish không tồn tại");
		}
		try{
			Dog dog = context.getBean(Dog.class);
			if(dog != null){
				System.out.println("Bean " + dog);
				dog.Dog();
			}
		}catch (Exception ex){
			System.out.println("Bean Dog không tồn tại");
		}
		try{
			Cat cat = context.getBean(Cat.class);
			if(cat != null){
				System.out.println("Bean " + cat);
				cat.Cat();
			}
		}catch (Exception ex){
			System.out.println("Bean Cat không tồn tại");
		}
	}
}

