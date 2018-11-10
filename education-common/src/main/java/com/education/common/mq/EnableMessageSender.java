package com.education.common.mq;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.education.common.config.MessageSenderType;

/**
 * 开启消息发送 
 * @author xupengtao
 *
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MessageSenderAutoConfiguration.class)
public @interface EnableMessageSender {
	
	/**
	 * 当前选择的message sender类型
	 * @return
	 */
	 String type() default MessageSenderType.Kafka.type;
	
	 /**
	  * 当前message sender 配置文件路径
	  * @return
	  */
	 String path() default MessageSenderType.Kafka.path;

}
