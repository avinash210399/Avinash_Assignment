package assignment3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ques3 {

	public static void main(String[] args) {
		
		ArrayList<Person> list= new ArrayList<Person>();
		
		list.add(new Person("Avinash",160,98));
		list.add(new Person("Adam",158,98));
		list.add(new Person("Mark",158,98));
		list.add(new Person("Bob",155,86));
		list.add(new Person("Carl",160,86));
		
		ListIterator<Person> listIterator=list.listIterator();
		
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}