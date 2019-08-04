package cn.vincent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vincent.mapper.UserMapper;
import cn.vincent.service.UserService;
import cn.vincent.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	
}
