package com.practice.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDoa {
	public void addAccount(String name) {
		System.out.println(getClass()+" - Adding account in membership.. Please wait "+name);
	}
}
