package com.collage_enterprise_resource_planning;

import com.collage_enterprise_resource_planning.studentrepository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 *
 * This class is the entry point of this project
 *
 * @author  anuj sundriyal
 */
@SpringBootApplication
public class CollageEnterpriseResourcePlanningApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(CollageEnterpriseResourcePlanningApplication.class, args);
	   StudentRepository studentRepository=applicationContext.getBean(StudentRepository.class);
	}
	
}
