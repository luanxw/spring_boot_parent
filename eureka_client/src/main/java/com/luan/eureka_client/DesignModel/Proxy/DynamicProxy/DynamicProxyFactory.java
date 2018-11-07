package com.luan.eureka_client.DesignModel.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory {
	
	//维护一个目标对象
	private Object target;
	
	public DynamicProxyFactory(Object target){
		this.target = target;
	}
	
	//给目标生成代理对象
	public Object getDynamicProxyInterface (){
		return Proxy.newProxyInstance(
			target.getClass().getClassLoader(),
			target.getClass().getInterfaces(),
			new InvocationHandler(){
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					System.out.println("Dynamic Method 开始事务......");
					//执行目标对象方法
						Object objectValue = method.invoke(target,args);
					System.out.println("Dynamic Method 提交事务......");

					return objectValue;
				}
			}
		);				
	}
	
}
