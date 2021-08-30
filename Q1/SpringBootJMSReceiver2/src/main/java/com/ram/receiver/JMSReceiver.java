package com.ram.receiver;


import org.springframework.stereotype.Component;

import com.ram.model.Product;
@Component
public class JMSReceiver 
{
public void receiveMessage(Product p) {
	System.out.println(p);
}
	
}

