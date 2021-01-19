package com.somin.枚举;

import java.lang.reflect.Method;
import java.util.EnumSet;

public class EnumSetDome
{
	public static void main(String[] args) {
		EnumSet<SeasonDomeType> set1=EnumSet.allOf(SeasonDomeType.class);
		System.out.println("allOf:"+set1);

		EnumSet<SeasonDomeType> set3=EnumSet.copyOf(set1);
		System.out.println("copyOf:"+set3);

		EnumSet<SeasonDomeType> set4=EnumSet.noneOf(SeasonDomeType.class);
		System.out.println("noneOf:"+set4);

		EnumSet<SeasonDomeType> set5=EnumSet.of(SeasonDomeType.SPRING);
		System.out.println("of:"+set5);

		EnumSet<SeasonDomeType> set2=EnumSet.complementOf(set5);
		System.out.println("complementOf:"+set2);

		EnumSet<SeasonDomeType> set6=EnumSet.range(SeasonDomeType.SPRING,SeasonDomeType.AUTUMN);
		System.out.println("range:"+set6);
	}
}
