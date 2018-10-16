package com.education.service.base.course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.education.service.base.cource.CourseListBaseService;

/**
 * 课程基础服务
 * @author xupengtao
 *
 */
@EnableAutoConfiguration
@MapperScan(basePackages="com.education.dao")
@SpringBootApplication
public class BaseCourseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BaseCourseApplication.class, args);
		CourseListBaseService service = context.getBean(CourseListBaseService.class);
		service.listCourseByCate(null);
		
	}
	
}
