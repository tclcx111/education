package com.education.common.mq;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

public class MessageSenderAutoConfiguration implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		MultiValueMap<String, Object> map = importingClassMetadata.getAllAnnotationAttributes(EnableMessageSender.class.getCanonicalName());
	}

}
