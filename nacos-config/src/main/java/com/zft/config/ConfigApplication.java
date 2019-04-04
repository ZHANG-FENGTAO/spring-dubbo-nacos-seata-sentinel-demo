package com.zft.config; /**
 * @author zft
 * @date 2019/4/4.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;


@SpringBootApplication
public class ConfigApplication {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);
		String userName = applicationContext.getEnvironment().getProperty("user.name");
		String userAge = applicationContext.getEnvironment().getProperty("user.age");
		//获取当前部署的环境
		String currentEnv = applicationContext.getEnvironment().getProperty("current.env");
		System.err.println("in " + currentEnv + " enviroment; " + "user name :" + userName + "; age: " + userAge);
		TimeUnit.SECONDS.sleep(1);
	}

}