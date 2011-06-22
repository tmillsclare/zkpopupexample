package me.timothyclare.zkpopupexample.bean;

public class Person {
	
	private String _firstName, _lastName;
	
	public Person(String firstName, String lastName) {
		_firstName = firstName;
		_lastName = lastName;
	}
	
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String _firstName) {
		this._firstName = _firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String _lastName) {
		this._lastName = _lastName;
	}
}
