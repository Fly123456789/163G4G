package com.qhit.lh.g4.fly.t6.dao;


import java.util.List;

import com.qhit.lh.g4.fly.t6.bean.Emp;
import com.qhit.lh.g4.fly.t6.bean.UserInfo;



public interface BaseDao {
	public List<UserInfo> login(UserInfo user);
	
	public List<Emp> getEmpByName(String name);
	
	public void add(Object obj);

	/**
	 * @param user
	 */
	public void update(Object obj);

	/**
	 * @param user
	 */
	public void delete(Object obj);

	/**
	 * @param string
	 */
	public List<Object> queryAll(String fromStr);   
	
	/**
	 * @param string
	 */
	public Object getObjectById(Class clazz,int id); 
}

