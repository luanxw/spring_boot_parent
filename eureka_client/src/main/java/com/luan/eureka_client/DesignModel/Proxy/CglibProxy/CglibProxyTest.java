package com.luan.eureka_client.DesignModel.Proxy.CglibProxy;

public class CglibProxyTest {

	public static void main(String[] args) {
		
		//目标对象
		CglibUserDao target = new CglibUserDao();
		
		//代理对象
		CglibUserDao proxy = (CglibUserDao) new CglibProxyFactory(target).getProxyInstance();
		
		//执行代理的对象的方法
		proxy.save();
				
	}
}
