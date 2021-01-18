package com.somin.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

interface  Person2
{
	void earnMoney();
}
class Worker2 implements Person2
{
	private String name;
	public Worker2(String name) {
		this.name = name;
	}
	public void earnMoney()
	{
		System.out.println(name+":打工人，打工魂");
	}
}
class WorkerInvocationHandler<T> implements InvocationHandler
{
	T worker;
	public WorkerInvocationHandler(T worker){
		this.worker=worker;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		System.out.println("代理执行" +method.getName() + "方法");
		return method.invoke(worker, args);
	}
}
public class 动态工厂测试
{
	public static void main(String[] args)
	{
//		Worker worker=new Worker("小明");
//		WorkerInvocationHandler handler=new WorkerInvocationHandler(worker);
//		Person2 proxy= (Person2)Proxy.newProxyInstance(Person2.class.getClassLoader(),new Class<?>[]{Person2.class},handler);
//		proxy.earnMoney();
	}
}
