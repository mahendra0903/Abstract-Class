package pack123;

public class Test3 extends Test2 {

	public void abstractTest123() {
		System.out.println("2nd abstract method");
		
	}

	public void abstractTest456() {
	    System.out.println("3rd abstract method");
		
	}
	
	public static void main(String[] args) {
		Test3 r = new Test3();
		r.abstractTest();
		r.abstractTest123();
		r.abstractTest456();
		r.test();
		demo();
		Test1.demo();
		Test2.demo();
		Test3.demo();
	}

}
