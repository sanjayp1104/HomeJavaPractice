package com.practice.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	@Autowired//DI using Fields
	//@Qualifier("happyFortuneService")
	@Qualifier("goodFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired//DI using COnstructor
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "10k Runnig Daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	/*@Autowired//DI using Setter
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired//DI using Setter
	public void testMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

}
