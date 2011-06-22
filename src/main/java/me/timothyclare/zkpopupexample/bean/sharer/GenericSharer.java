package me.timothyclare.zkpopupexample.bean.sharer;


public interface GenericSharer<T> {
	void setBean(T p);
	T getBean();
	
	void update();
}
