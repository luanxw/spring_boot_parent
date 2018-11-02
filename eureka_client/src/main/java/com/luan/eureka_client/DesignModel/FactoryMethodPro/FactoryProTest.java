package com.luan.eureka_client.DesignModel.FactoryMethodPro;

public class FactoryProTest {
	public static void main(String[] args) {
		Provider provider = new SendPhoneFactory();
		Sender sender = provider.produce();
	   sender.Sending();
	}

}
