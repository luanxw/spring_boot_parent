package com.luan.eureka_client.DesignModel.FactoryMethod;

public class SenderFactory {

	public static Sender produceMail(){
		return new MailSender();
	}

	public static Sender producePhone(){
		return new PhoneSender();
	}
}
