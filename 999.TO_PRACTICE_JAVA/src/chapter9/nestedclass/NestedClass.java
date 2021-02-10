package chapter9.nestedclass;

/**바깥 클래스**/
public class NestedClass {
	
	public NestedClass() {
		System.out.println("NestedClass 객체가 생성됨");
	}
	
	/**인스턴스 멤버 클래스**/
	public class B {
		public B() {
			System.out.println("인스턴스 멤버 클래스 B객체가 생성됨");
		}
		public int field1;
		//public static int field2;
		public void method1() { }
		//public static void method2() { }		
	}
	
	/**정적 멤버 클래스**/
	public static class C {
		public C() {
			System.out.println("정적 멤버 클래스 C객체가 생성됨");
		}
		public int field1;
		public static int field2;
		public void method1() {}
		public static void method2() {}
	}
	
	/**로컬 클래스**/
	public void method() {
		class D {
			public D() {
				System.out.println("로컬 클래스 D객체 생성됨");
			}
			public int field1;
			//public static int field2;
			public void method1() {}
			//public static method2() {}	
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
