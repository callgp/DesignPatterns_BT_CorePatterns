package com.gp.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable,Cloneable {
	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance;

	// private static DateUtil instance= new DateUtil();

	/*
	 * static{ instance=new DateUtil(); }
	 */
	private DateUtil() {

	}

	// public static synchronized DateUtil getInstance(){
	public static synchronized DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {

					instance = new DateUtil();
				}
			}
		}
		return instance;

	}
	
	protected Object readResolve(){
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		throw new CloneNotSupportedException();
	}

}
