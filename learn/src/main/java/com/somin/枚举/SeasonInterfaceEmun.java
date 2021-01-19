package com.somin.枚举;

import java.util.Random;

public enum SeasonInterfaceEmun {
	SPRING(SeasonInterface.spring.class) ,
	SUMMER (SeasonInterface.summer.class),
	AUTUMN (SeasonInterface.autumn.class),
	WINTER (SeasonInterface.winter.class);
	private SeasonInterface[] values;
	SeasonInterfaceEmun(Class<? extends SeasonInterface> kind) {
		values = kind.getEnumConstants();
	}
	public SeasonInterface random() {
		Random random=new Random();
		return values[random.nextInt(4)];
	}

}
