package cn.vincent.service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.vincent.vo.User;

public class UserServiceTest {

	@Test
	public void testFindAll(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=ac.getBean(UserService.class);
		List<User> list=userService.findAll();
		for(User u:list){
			System.out.println(u);
		}
	}
}
