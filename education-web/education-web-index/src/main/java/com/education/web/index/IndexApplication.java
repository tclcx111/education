package com.education.web.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 网站首页
 * @author xupengtao
 *
 */
@ImportResource(locations="classpath:dubbo.xml")
@SpringBootApplication
public class IndexApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(IndexApplication.class, args);
	}
}
