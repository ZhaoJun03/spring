package com.zhaojun.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author ZhaoJun
 * @date 2019/7/5 14:46
 */
@Aspect
@EnableAspectJAutoProxy
@Component
public class LogAspect {

	@Pointcut("execution(public int com.zhaojun.bean.Calculator.div(..))")
	public void pointCut() {
	}

	@Before(value = "pointCut()")
	public void beforeDiv() {
		System.out.println("马上开始除法运算：。。。。。。");
	}
}
