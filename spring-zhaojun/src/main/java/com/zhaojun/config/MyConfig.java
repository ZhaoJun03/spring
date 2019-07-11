package com.zhaojun.config;

import com.zhaojun.bean.Calculator;
import com.zhaojun.bean.Dog;
import com.zhaojun.bean.Person;
import com.zhaojun.custom.CustomFactoryBean;
import org.springframework.context.annotation.*;

/**
 * @author ZhaoJun
 * @date 2019/7/5 15:53
 */

@Configuration
@ComponentScan("com.zhaojun")
@Import(CustomFactoryBean.class)
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