package javaprogrammes;

class Bank{
	void demo(int ifsc_code){
		System.out.println("All banks have many transactions");
	}
		
}

class SBI extends Bank{
	void demo(String name){
		System.out.println("Bank = " + name);
	}
}

class ICICI extends Bank{
	void demo(String name){
		System.out.println("ICICI = " + name);
	}
}

public class Overloading2 {

	public static void main(String[] args) {
		Bank obj = new ICICI();
		obj.demo(12);
		ICICI obj1 =(ICICI) obj;
		obj1.demo("ICICI");
				
	}
}
