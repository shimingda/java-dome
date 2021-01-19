package com.somin.反射;

import java.lang.reflect.Field;
import java.util.Arrays;

public class invoke
{
	public static void main(String[] args)
	{
		try {
			Class<?> c = Class.forName("com.somin.枚举.SeasonDomeType");

			//Class.isEnum()  表明该类是否是枚举类
			System.out.println("isEnum : "+ c.isEnum());
			//Class.getEnumConstants()  返回类中声明的枚举实例   等同于 RetentionPolicy.values();
			System.out.format("Enum name:  %s%nEnum constants:  %s%n",
					c.getName(), Arrays.asList(c.getEnumConstants()));

			for(Field field : c.getDeclaredFields()){
				if(field.isEnumConstant()){
					System.out.println(field.toGenericString());
				}
			}

		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}
}
