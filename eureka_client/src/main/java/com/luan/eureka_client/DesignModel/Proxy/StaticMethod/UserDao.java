package com.luan.eureka_client.DesignModel.Proxy.StaticMethod;

public class UserDao  implements  InterfaceUserDao{

	@Override
	public void save() {
		System.out.println("--------数据已经保存-------");
	}
}
