package com.offer;

/**
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
 * �ж��������Ƿ��и�������
 *
 */
public class Dome0001
{
	public boolean Find(int target, int[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if (target == array[i][j])
				{
					return true;
				}
				if (target < array[i][j])
				{
					continue;
				}
			}
		}
		return false;
	}
}

