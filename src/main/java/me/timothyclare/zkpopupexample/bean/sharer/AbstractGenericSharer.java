package me.timothyclare.zkpopupexample.bean.sharer;

public abstract class AbstractGenericSharer<T> implements GenericSharer<T> {
	
	private T _bean;
	
	public void setBean(T bean) {
		_bean = bean;
	}

	public T getBean() {
		return _bean;
	}

	public abstract void update();
}
