package com.test;

import com.somin.枚举.SeasonJavap;
import com.somin.枚举.SeasonDome;
import com.somin.枚举.SeasonType;
import org.junit.Test;

public class SeasonTypeTest
{

	@Test
	public void test1(){
		for (SeasonType seasonType:SeasonType.values()) {
			System.out.println("name():"+seasonType.name());
			System.out.println("ordinal():"+seasonType.ordinal());
		}
	}

	@Test
	public void test2(){
		SeasonType spring=SeasonType.valueOf("SPRING");
		System.out.println("type:"+spring.type+"--name:"+spring.name+"--desc:"+spring.desc);
		SeasonType autumn=SeasonType.valueOf(SeasonType.class,"AUTUMN");
		System.out.println("type:"+autumn.type+"--name:"+autumn.name+"--desc:"+autumn.desc);
	}
	@Test
	public void test3(){
		System.out.println(SeasonJavap.AUTUMN);
		System.out.println(SeasonDome.names);
		System.out.println(SeasonDome.desc);
	}

	@Test
	public void test4() throws Exception {
		//System.out.println(SeasonType.of(0).name);
		//System.out.println(SeasonType.of(1).say());
	}

}
