package javaprogrammes;

class A2{
	void test1(){ // over ridden method
		System.out.println("from class A2");
	}
	
}

class B2 extends A2{
	protected void test1(){ // overriding method
		System.out.println("from class B2 test1()");
	}
}

public class Overriding {

	public static void main(String[] args) {
		B2 obj = new B2();
		obj.test1();  // though called test1() [method] printing subclass method out put , hence sub class method has overrideen the super class method
	}
}
