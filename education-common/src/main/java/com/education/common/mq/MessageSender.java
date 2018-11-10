package com.education.common.mq;

/**
 * 消息发送 
 * @author xupengtao
 *
 */
public interface MessageSender {

	/**
	 * 往topic 发送消息
	 * @param topic
	 * @param data
	 */
	void sendMessage(String topic,String data);
	
}
