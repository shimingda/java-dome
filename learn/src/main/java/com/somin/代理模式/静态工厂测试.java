package com.somin.代理模式;
interface  Person1
{
	void earnMoney();
}
class Worker1 implements Person1
{
	private String name;
	public Worker1(String name) {
		this.name = name;
	}
	public void earnMoney()
	{
		System.out.println(name+":打工人，打工魂");
	}
}
class WorkerProxy implements Person1
{
	Worker1 worker;
	public WorkerProxy(Worker1 worker){
		this.worker=worker;
	}
	public void earnMoney()
	{
		worker.earnMoney();
	}
}
public class 静态工厂测试
{
	public static void main(String[] args)
	{
		Worker1 worker=new Worker1("小明");
		WorkerProxy proxy=new WorkerProxy(worker);
		proxy.earnMoney();
	}
}
