package com.somin.test;

public class Dome02
{
	public static void main(String[]args){
	int count=0;
	for(int i=0;i<10;i++){
		count=count++;
	}
	System.out.println("count="+count);
	boolean b3=new Object() instanceof String;
	System.out.println(b3);
	assert b3:"abcdefg";
	}
}
