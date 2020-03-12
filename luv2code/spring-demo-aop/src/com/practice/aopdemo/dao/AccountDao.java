package com.practice.aopdemo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class AccountDao {
	public void addAccount() {
		System.out.println(getClass()+"  --Adding Account.. Please wait.... :D");
	}
	
	public String[] getAllAcctNames() {
		String[] accts = {"Corporate","Retail","Subsidy","Agriculture"};
		return accts;
	}
}
