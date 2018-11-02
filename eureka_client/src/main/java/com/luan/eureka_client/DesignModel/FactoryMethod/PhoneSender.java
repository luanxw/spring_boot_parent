package com.luan.eureka_client.DesignModel.FactoryMethod;

public class PhoneSender implements Sender {
	@Override
	public void Send() {
		System.out.println("This is Phone sending.......");
	}
}
