package com.education.common.config;

import org.springframework.context.annotation.Import;


public class MessageSenderType {

	/**
	 * kafka 配置
	 * @author xupengtao
	 *
	 */
	public class Kafka{
		
		public final static String type="kafka";
		
		public final static String path = "kafka.properties";
	}
	
}
