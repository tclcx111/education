package com.test.gen;

import com.mybatis.generator.factory.GeneratorFactory;

public class GenTest {
	
	public static void main(String[] args) {
		try {
			String path = GenTest.class.getResource("/generatorConfig.xml").getPath();
			GeneratorFactory factory = new GeneratorFactory(path);
			factory.generate();
			System.out.println("done");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
