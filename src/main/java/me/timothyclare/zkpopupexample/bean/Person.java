package me.timothyclare.zkpopupexample.bean;

public class Person {
	
	private String _firstName, _lastName;
	private int _age;
	
	public Person(String firstName, String lastName, int age) {
		_firstName = firstName;
		_lastName = lastName;
		_age = age;
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
	public int getAge() {
		return _age;
	}
	public void setAge(int _age) {
		this._age = _age;
	}
}
