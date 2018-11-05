package com.luan.eureka_client.DesignModel.Singleton;

public class SingletonMix {
	private static class SingletonHolder{
		private static final SingletonMix Instace = new SingletonMix();
	}	
	
	private SingletonMix(){ }
	
	public  static  final SingletonMix getInstance(){
		return SingletonHolder.Instace;
	}
	
	/*
	这种写法仍然使用JVM本身机制保证了线程安全问题；
	由于 SingletonHolder 是私有的，除了 getInstance()之外没有办法访问它，
	因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。
	*/
	
}
