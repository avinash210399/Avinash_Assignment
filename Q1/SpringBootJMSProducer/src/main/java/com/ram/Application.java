package com.ram;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.config.RabbitMQConfiguration;
import com.ram.model.Product;

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
		
		List<Product> p=new ArrayList<>();
		
		p.add(new Product(1,"book",11));
		p.add(new Product(2,"pencil",110));
		p.add(new Product(3,"pen",101));
		p.add(new Product(4,"bench",1));
		p.add(new Product(5,"blackboard",23));
		p.add(new Product(6,"notebook",11));
		p.add(new Product(7,"laptop",78));
		p.add(new Product(8,"mouse",2));
		p.add(new Product(9,"keyboard",8));
		p.add(new Product(10,"monitor",15));
		System.out.println("Sending message...");
		
		p.stream()
		.filter(n->n.getQuantity()< 10)
		.forEach(n -> rabbitTemplate.convertAndSend(RabbitMQConfiguration.fanoutExchangeName,
				"", p));
		
		System.out.println("Message sent successfully...");
	}

}