package com.luan.eureka_client.DesignModel.FactoryMethodPro;

public class PhoneSender implements Sender {
	@Override
	public void Sending() {
		System.out.println("This is  Phone sending ......");
	}
}
