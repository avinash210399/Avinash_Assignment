package com.jms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jms.config.RabbitMQConfiguration;
import com.jms.model.News;


@SpringBootApplication
public class Application implements CommandLineRunner
{

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) throws InterruptedException
	{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		
		List<News> p=new ArrayList<>();
		p.add(new News(1,"title1","Sports"));
		p.add(new News(2,"title2","Politics"));
		p.add(new News(3, "title3", "Technology"));
		p.add(new News(4, "COVID-19", "Science"));
		System.out.println("Sending message...");
		
		p.stream()
		.forEach(n -> rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName,
				n.getCategory(), p));
		
		System.out.println("Message sent successfully...");
	}

}