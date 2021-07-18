package assignment2;

public class AbstractClassPrinciples {
	import java.sql.SQLOutput;
	import java.util.Scanner;

	public class AbstractClassPrinciples {
	    public static void main(String[] args) {

	        Child c = new Child();
	        Parent p = new Parent() {
	            @Override
	            public void greet() {
	                System.out.println("WELCOME......");
	            }
	        };


	    }


	}

	abstract class Parent{
	    public Parent(){
	        System.out.println("Constructor");
	    }

	    abstract public void greet();

	}

	class Child extends Parent{
	    @Override
	    public void greet(){
	        System.out.println("Hello how are you");

	    }
	}

	abstract class Child2 extends Parent{
	    public void method_(){
	        System.out.println("I am fine.");
	    }
	}
}
