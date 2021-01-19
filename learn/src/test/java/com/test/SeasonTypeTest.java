package com.test;

import com.somin.枚举.SeasonDome;
import com.somin.枚举.SeasonDomeType;
import com.somin.枚举.SeasonInterface;
import com.somin.枚举.SeasonInterfaceEmun;
import com.somin.枚举.SeasonJavap;
import com.somin.枚举.SeasonMethod;
import com.somin.枚举.SeasonMethodAbstract;
import org.junit.Test;

public class SeasonTypeTest
{

	@Test
	public void test1(){
		for (SeasonDomeType seasonType: SeasonDomeType.values()) {
			System.out.println("name():"+seasonType.name());
			System.out.println("ordinal():"+seasonType.ordinal());
		}
	}

	@Test
	public void test2(){
		SeasonDomeType spring= SeasonDomeType.valueOf("SPRING");
		System.out.println("type:"+spring.type+"--name:"+spring.name+"--desc:"+spring.desc);
		SeasonDomeType autumn= SeasonDomeType.valueOf(SeasonDomeType.class,"AUTUMN");
		System.out.println("type:"+autumn.type+"--name:"+autumn.name+"--desc:"+autumn.desc);
	}

	@Test
	public void test3(){
		System.out.println(SeasonJavap.AUTUMN);
		System.out.println(SeasonDome.types);
		System.out.println(SeasonDome.names);
		System.out.println(SeasonDome.desc);
	}

	@Test
	public void test4() throws Exception {
		System.out.println(SeasonDomeType.of(0).name);
		System.out.println(SeasonDomeType.of(1));
	}

	@Test
	public void test5() throws Exception {
		for (SeasonMethod season:SeasonMethod.values()) {
			season.time();
			season.temp();
			System.out.println("-----------");
		}
	}

	@Test
	public void test6() throws Exception {
		for (SeasonMethodAbstract season:SeasonMethodAbstract.values()) {
			season.activity();
			System.out.println("-----------");
		}
	}
	@Test
	public void test7() throws Exception {
		for (SeasonInterfaceEmun season: SeasonInterfaceEmun.values()) {
			for (int i=1;i<5;i++){
				System.out.println(season.random());
			}
			System.out.println("-----------");
		}
	}
}
