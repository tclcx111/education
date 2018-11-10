package com.education.service.userCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.education.common.config.MessageSenderType;
import com.education.common.mq.EnableMessageSender;

@SpringBootApplication
@EnableMessageSender(type=MessageSenderType.Kafka.type,path=MessageSenderType.Kafka.path)
public class UserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterApplication.class, args);
	}
	
}
