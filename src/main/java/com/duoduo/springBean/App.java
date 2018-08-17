package com.duoduo.springBean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.common.beans.Car;

/**
 * Hello world!
 *
 */
public class App {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");

		// 2.从IOC容器中获取bean实例
		Car car = (Car) ctx.getBean(Car.class);

		// 3、调用hello方法
		System.out.println(car);
		System.out.println("Hello World!");
	}
}
