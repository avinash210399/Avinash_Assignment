package assignment4;

import java.util.ArrayList;
import java.util.List;


public class Ques8 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		
		Thread thread=new Thread(()->{
			list.forEach(System.out::println);
		});
		thread.start();
	}
}