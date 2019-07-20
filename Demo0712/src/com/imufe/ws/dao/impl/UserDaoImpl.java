package com.imufe.ws.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.imufe.ws.dao.UserDao;
import com.imufe.ws.pojo.User;
import com.imufe.ws.util.JdbcUtil;
import com.mysql.jdbc.PreparedStatement;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> selectALL() {
		// TODO Auto-generated method stub
		return null;
	}


	public User selectOne(User user) throws Exception {
		//1.连接
		Connection conn=JdbcUtil.getConnection();
		String sql="select * from ws_user where username= ? and password=? ";
		User dbUser=null;
		//获取执行语句对象
		java.sql.PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		//获取结果集
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			dbUser=new User();
			dbUser.setId(rs.getInt("id"));
			dbUser.setUsername(rs.getString("username"));
			dbUser.setPassword(rs.getString("password"));
		}
		
		
		return dbUser;
	}
	
	

	@Override
	public User selectByUsernameAndPassowrd(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryId(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updataByPrimaryId(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}



}
