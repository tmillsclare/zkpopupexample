package me.timothyclare.zkpopupexample.bean.sharer;

import me.timothyclare.zkpopupexample.bean.Person;

public interface PersonSharer {
	void setPerson(Person p);
	Person getPerson();
	
	void update();
}
