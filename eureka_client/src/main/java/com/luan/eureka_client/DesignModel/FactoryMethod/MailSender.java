package com.luan.eureka_client.DesignModel.FactoryMethod;

public class MailSender implements Sender{

	@Override
	public void Send() {
		System.out.println("This is Mail sending.......");
	}
}
