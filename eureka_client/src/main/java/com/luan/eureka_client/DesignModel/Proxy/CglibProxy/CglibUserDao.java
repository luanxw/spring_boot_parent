package com.luan.eureka_client.DesignModel.Proxy.CglibProxy;


/**
 * 目标对象,没有实现任何接口
 */
public class CglibUserDao {
	
	public void save() {
		System.out.println("----已经保存数据!----");
	}
}
