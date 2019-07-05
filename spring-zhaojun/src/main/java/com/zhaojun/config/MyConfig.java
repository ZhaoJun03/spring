package com.zhaojun.config;

import com.zhaojun.bean.Calculator;
import com.zhaojun.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhaoJun
 * @date 2019/7/5 15:53
 */

@Configuration
@ComponentScan("com.zhaojun")
public class MyConfig {

	@Bean
	public Person person() {
		return new Person();
	}

	@Bean
	public Calculator calculator() {
		return new Calculator();
	}

}