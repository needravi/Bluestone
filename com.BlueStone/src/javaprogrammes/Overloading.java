package javaprogrammes;

class A1{
	void test(){
		System.out.println("from class A1 test()");
	}
}

class B1 extends A1{
	void test(int i){
		System.out.println("from class B1 test(int i)");
	}
	
	void test(String name){
		System.out.println("from class B1 test(String)");
	}
}

public class Overloading {

	public static void main(String[] args) {
		B1 b = new B1();
		b.test();
		b.test(10);
		b.test("demos");
		
	}
	
}
