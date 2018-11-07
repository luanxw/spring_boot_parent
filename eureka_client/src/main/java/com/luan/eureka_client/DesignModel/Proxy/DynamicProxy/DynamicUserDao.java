package com.luan.eureka_client.DesignModel.Proxy.DynamicProxy;

import com.luan.eureka_client.DesignModel.Proxy.StaticMethod.InterfaceUserDao;

public class DynamicUserDao implements InterfaceUserDao {
	@Override
	public void save() {
		System.out.println("---------保存数据---------");
	}
}
