package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerLoginDao;
import com.example.model.CustomerLogin;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{

	@Autowired

	private CustomerLoginDao customerLoginDao;

	@Override

	public String authenticateCustomer(CustomerLogin customerLogin) {

	// TODO Auto-generated method stub

	{

	String toRet = null;

	CustomerLogin customerLoginFromDao = customerLoginDao

	.getCustomerLoginByLoginName(customerLogin.getLoginName());

	if (customerLogin.getPassword().equals(

	customerLoginFromDao.getPassword())) {

	toRet = "Success";

	} else {

	toRet = "Failed";

	}

	return toRet;

	}

	}
	

}
