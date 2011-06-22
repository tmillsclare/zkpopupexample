package me.timothyclare.zkpopupexample.controllers;

import java.util.HashMap;
import java.util.Map;

import me.timothyclare.zkpopupexample.bean.Person;
import me.timothyclare.zkpopupexample.bean.sharer.AbstractGenericSharer;
import me.timothyclare.zkpopupexample.bean.sharer.GenericSharer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zkplus.databind.DataBinder;

public class MainController extends GenericForwardComposer {
	
	private static final long serialVersionUID = -4714208477741689442L;
	private static final String popupLocation = "popup/person.zul";
	
	private Person _person = new Person("Example", "Person");
	
	public Person getPerson() {
		return _person;
	}
	
	public void setPerson(Person person) {
		_person = person;
	}
	
	public void onClick$btnEdit(ForwardEvent fe) {
		
		Object objBinder = fe.getPage().getAttribute("binder");
		
		//here we assume it will not be null, could be though so needs to be checked
		final DataBinder binder = (DataBinder)objBinder;
		
		GenericSharer<Person> personsharer = new AbstractGenericSharer<Person>() {

			@Override
			public void update() {
				binder.loadAll();
			}
			
		};
		
		personsharer.setBean(_person);
		
		Map<String, GenericSharer<Person>> args = new HashMap<String, GenericSharer<Person>>();
		args.put("personsharer", personsharer);
		
		Component component = Executions.createComponents(popupLocation, null, args);
		AnnotateDataBinder db = new AnnotateDataBinder(component);
		db.loadAll();
		
		component.setVisible(true);
	}
}
