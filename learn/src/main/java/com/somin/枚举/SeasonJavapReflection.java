package com.somin.枚举;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 反射判断
 */
public class SeasonJavapReflection {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException
	{
		Class seasonJavapClass=SeasonJavap.class;

		boolean isEnum=seasonJavapClass.isEnum();
		System.out.println("isEnum:"+isEnum);

		Object[] seasonJavaps= seasonJavapClass.getEnumConstants();
		for (Object s:seasonJavaps) {
			System.out.println("Object:"+s);
		}
		Constructor[] constructors=seasonJavapClass.getDeclaredConstructors();
		for (Constructor constructor:constructors){
			System.out.println("constructor name:"+constructor.getName()+"--is synthetic:" +constructor.isSynthetic());
		}

		Method[] methods=seasonJavapClass.getDeclaredMethods();
		for (Method method:methods){
			System.out.println("method name:"+method.getName()+"--is synthetic:" +method.isSynthetic());
		}

		Field[] fields=seasonJavapClass.getDeclaredFields();
		for (Field field:fields){
			System.out.println("field name:"+field.getName()+"--is synthetic:" +field.isSynthetic());
		}

		SeasonJavap seasonJavap= (SeasonJavap) seasonJavapClass.newInstance();
	}
}
