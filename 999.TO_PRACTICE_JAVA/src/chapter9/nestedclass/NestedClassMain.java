package chapter9.nestedclass;

public class NestedClassMain {

	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
		
		//인스턴스 멤버 클래스 객체 생성
		NestedClass.B b = nc.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		NestedClass.C c = new NestedClass.C();
		c.field1 = 3;
		c.method1();
		
		c.field2 = 3;
		c.method2();
		
		/**로컬 클래스 객체 생성을 위한 메소드 호출**/
		nc.method();
	}

}
