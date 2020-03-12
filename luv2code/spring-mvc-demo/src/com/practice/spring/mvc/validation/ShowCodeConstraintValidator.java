package com.practice.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ShowCodeConstraintValidator implements ConstraintValidator<ShowCode, String> {
	
	private String coursePrefix;
	@Override
	public void initialize(ShowCode theShowCode) {
		coursePrefix = theShowCode.value();
		
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		boolean result;
		
		if((!theCode.equalsIgnoreCase("")) && (theCode != null)) {
			result = theCode.startsWith(coursePrefix);
		}else {
			result = true;
		}
		return result;
	}

}
