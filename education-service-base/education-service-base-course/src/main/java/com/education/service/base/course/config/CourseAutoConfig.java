package com.education.service.base.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.education.service.base.cource.CourseListBaseService;
import com.education.service.base.course.impl.CourseListBaseServiceImpl;

@Configuration
public class CourseAutoConfig {

	 @Bean
	 public CourseListBaseService courseListBaseService() {
		 return new CourseListBaseServiceImpl();
	 }

	
}
