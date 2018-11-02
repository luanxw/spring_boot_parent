package com.luan.eureka_client.DesignModel.FactoryMethodPro;

public class SendPhoneFactory implements Provider {
	@Override
	public Sender produce() {
		return new PhoneSender();
	}
}
