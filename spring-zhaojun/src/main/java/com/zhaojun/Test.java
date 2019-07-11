package com.zhaojun;

import com.zhaojun.bean.Calculator;
import com.zhaojun.bean.Person;
import com.zhaojun.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ZhaoJun
 * @date 2019/7/5 15:54
 */

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person = (Person)context.getBean("person");
		System.out.println(person);
		Calculator calculator = (Calculator)context.getBean("calculator");
		int result = calculator.div(5, 2);
		System.out.println(result);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
}
