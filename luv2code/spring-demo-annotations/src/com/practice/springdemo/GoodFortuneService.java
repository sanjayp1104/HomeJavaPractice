package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a good day";
	}

}
