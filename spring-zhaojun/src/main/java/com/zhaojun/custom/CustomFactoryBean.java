package com.zhaojun.custom;

import com.zhaojun.bean.Dog;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ZhaoJun
 * @date 2019/7/11 14:48
 */

public class CustomFactoryBean implements FactoryBean<Dog> {

	@Override
	public Dog getObject() throws Exception {
		return new Dog();
	}

	@Override
	public Class<?> getObjectType() {
		return Dog.class;
	}
}
