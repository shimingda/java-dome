package com.offer;


public class Dome0002
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(sb));
	}
	public static  String replaceSpace(StringBuffer str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if(" ".equals(String.valueOf(str.charAt(i)))){
				str.replace(i,i+1,"%20");
			}
		}
		return str.toString();
	}
}
