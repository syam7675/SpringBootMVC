package com.example.dao;

import com.example.model.CustomerLogin;

public interface CustomerLoginDao {
	public CustomerLogin getCustomerLoginByLoginName(String loginName);

}
