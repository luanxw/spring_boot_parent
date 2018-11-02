package com.luan.eureka_client.DesignModel.FactoryMethodPro;

public class SendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new MailSender();
	}
}
