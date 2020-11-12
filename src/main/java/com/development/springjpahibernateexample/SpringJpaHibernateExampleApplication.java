package com.development.springjpahibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// @EnableJpaRepositories(basePackages="com.development.springjpahibernateexample.repository")
@EnableJpaRepositories("com.development.springjpahibernateexample.repository")
@SpringBootApplication
public class SpringJpaHibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateExampleApplication.class, args);
//		// SpringApplication.run(SpringHelloWorldApplication.class, args);
//		new SpringApplicationBuilder(SpringJpaHibernateExampleApplication.class)
//		.registerShutdownHook(true)
//		.run(args);
	}

}
