package com.practice.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.practice.spring.mvc.validation.ShowCode;

public class Customer {
	
	@NotNull(message = "is mandatory")
	private String firstName;
	
	@NotNull(message = "is mandatory")
	@Size(min=8, message = "Minimum lenght should be 5 chars")
	private String lastName;
	
	@NotNull
	@Min(value = 2, message = "Mininum 2 passes should purchase")
	@Max(value = 10, message = "Max of 10 passes allowed to single user")
	//private int noofPasses;
	private Integer noofPasses;
	
	@NotNull(message = "is mandatory")
	@Pattern(regexp = "^[a-zA-Z0-9]{6}",message = "Code Should be 6 Characters / digits")
	private String postalCode;
	
	@NotNull
	@ShowCode(value = "MOVIE" ,message = "ShowCode must start with movie")
	private String showCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getNoofPasses() {
		return noofPasses;
	}
	public void setNoofPasses(Integer noofPasses) {
		this.noofPasses = noofPasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getShowCode() {
		return showCode;
	}
	public void setShowCode(String showCode) {
		this.showCode = showCode;
	}
	
	

}
