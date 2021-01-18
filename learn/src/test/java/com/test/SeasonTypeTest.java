package com.test;

import com.somin.枚举.SeasonType;
import org.junit.Test;

public class SeasonTypeTest
{
	@Test
	public void test1(){
		SeasonType season=SeasonType.valueOf("SPRING");
		System.out.println("type:"+season.type+"--name:"+season.name+"--desc:"+season.desc);
	}
	@Test
	public void test2(){
		System.out.println("name():"+SeasonType.AUTUMN.name());
		System.out.println("ordinal():"+SeasonType.AUTUMN.ordinal());
	}
}
