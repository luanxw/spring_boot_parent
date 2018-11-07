package com.luan.eureka_client.DesignModel.Proxy.StaticMethod;

public class UserDaoProxy  implements  InterfaceUserDao{
	
	//接收保存目标对象
	private InterfaceUserDao target;
	
	public UserDaoProxy(InterfaceUserDao target){
		this.target = target;
	}
	@Override
	public void save() {
		System.out.println(" static Menthod 静态方法开始执行事务......");
		target.save();
		System.out.println(" static Menthod 静态方法提交执行事务......");

	}
}
