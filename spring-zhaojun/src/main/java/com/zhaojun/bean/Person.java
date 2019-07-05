package com.zhaojun.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author ZhaoJun
 * @date 2019/7/3 17:30
 */
@Data
@ToString
public class Person {

	@Value("蒙奇D路飞")
	private String name;
	@Value("19")
	private Integer age;

	public void toBeOnePiece() {
		System.out.println("海贼王 我当定了");

	}

}
