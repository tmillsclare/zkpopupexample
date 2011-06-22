package me.timothyclare.zkpopupexample.bean.sharer;

import me.timothyclare.zkpopupexample.bean.Person;

public abstract class AbstractPersonSharer implements PersonSharer {
	
	private Person _person;
	
	public void setPerson(Person p) {
		_person = p;
	}

	public Person getPerson() {
		return _person;
	}

	public abstract void update();
}
