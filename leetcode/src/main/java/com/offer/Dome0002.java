package com.offer;

/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
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
