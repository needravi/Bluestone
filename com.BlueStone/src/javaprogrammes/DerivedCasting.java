package javaprogrammes;

class A{
	int i = 10;
}

class B extends A{
	int j = 20;
}



class DerivedCasting {
	
	public static void main(String[] args) {
		A a1 = new B(); // upcasting 
		System.out.println(a1.i);
		B a2 = (B)a1; // down casting
		System.out.println(a2.j);
	}
		
}
