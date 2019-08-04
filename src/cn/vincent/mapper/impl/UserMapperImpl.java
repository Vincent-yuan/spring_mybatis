package cn.vincent.mapper.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.vincent.mapper.UserMapper;
import cn.vincent.vo.User;

@Repository("userMapper")
public class UserMapperImpl implements UserMapper {

	@Autowired
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession=sqlSession;
	}
	
	@Override
	public List<User> findAll() {
		return sqlSession.selectList("cn.vincent.mapper.UserMapper.findAll");
	}

	
}
