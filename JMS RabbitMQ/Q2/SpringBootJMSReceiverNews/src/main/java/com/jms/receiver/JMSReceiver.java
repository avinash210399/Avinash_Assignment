package com.jms.receiver;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.jms.model.News;
@Component
public class JMSReceiver{
	public void receiveMessage(News news) {
		System.out.println(news);
	}
}



