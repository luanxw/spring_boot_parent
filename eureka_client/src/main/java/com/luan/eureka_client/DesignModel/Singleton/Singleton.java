package com.luan.eureka_client.DesignModel.Singleton;

/**
 * 单例模式
 * */

public class Singleton {
	private static Singleton Instance;
	
	private Singleton(){ }
	
	public synchronized static Singleton getInstance(){
		if(Instance == null){
			Instance = new Singleton();
		}
		return Instance;
	}

	/*	
    虽然做到了线程安全，并且解决了多实例的问题，但是它并不高效。
	因为在任何时候只能有一个线程调用 getInstance() 方法。
	但是同步操作只需要在第一次调用时才被需要，即第一次创建单例实例对象时。
	
	这就引出了双重检验锁。
	*/
	
	//改进为SingletonPro文件
}
