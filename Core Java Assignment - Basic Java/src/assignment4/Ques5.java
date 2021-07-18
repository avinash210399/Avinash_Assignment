package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Ques5 {
	
	public static void main(String[] args) {
		
		StringBuilder result=new StringBuilder();
		List<String> list= new ArrayList<String>();
		
		list.add("Helicopter");
		list.add("East");
		list.add("Land");
		list.add("Leave");
		list.add("Oxford");
		list.add("xford");
		list.add("Bxford");
		list.add("Oxford");
		list.add("Yxford");
		list.add("Zxford");
		
		list.forEach(a->result.append(a.charAt(0)));
		
		System.out.println(result);
		
	}	
}