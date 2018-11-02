package com.luan.eureka_client.DesignModel.FactoryMethod;

public class FactoryTest {

	public static void main(String[] args) {
		  Sender sender = SenderFactory.produceMail();
		  sender.Send();
	}

}
