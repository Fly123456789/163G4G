package com.qhit.sbm.user.service;

import java.util.List;

import com.qhit.sbm.common.bean.PageBean;
import com.qhit.sbm.user.bean.User;

public interface UserService {

	
	public User doLogin(String name,String passWord);
	public int updatePassword(String newPwd , int userId);
	public List selectUser(PageBean userPage);
	public int addUser(User addUser);
}
