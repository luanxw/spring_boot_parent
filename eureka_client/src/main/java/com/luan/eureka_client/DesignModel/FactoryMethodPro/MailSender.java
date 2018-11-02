package com.luan.eureka_client.DesignModel.FactoryMethodPro;

public class MailSender implements Sender {
	@Override
	public void Sending() {
		System.out.println("This is Mail sending ......");
	}
}
