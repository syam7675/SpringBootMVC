package com.example.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.model.CustomerLogin;

@Repository
public class CustomerLoginDaoImpl implements CustomerLoginDao{
	//given the implementation of the method created in an interface

	public CustomerLogin getCustomerLoginByLoginName(String loginName) {

	Map<String, String> customerCredentials = new HashMap<String, String>();

	customerCredentials.put("tom", "tom123");

	customerCredentials.put("harry", "harry123");

	customerCredentials.put("garry", "garry123");

	customerCredentials.put("monica", "mocica123");

	CustomerLogin customerLogin = new CustomerLogin();

	customerLogin.setLoginName(loginName);

	customerLogin.setPassword(customerCredentials.get(loginName));

	return customerLogin;

	}

}
