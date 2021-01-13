package chapter9.nestedclass;

public class OuterFieldAndMethodNotAvailable {
	
	 //인스턴스 필드
	 public B field1 = new B();
	 public static C field2 = new C();
	 
	 //정적 필드
	 //public static B field3 = new B();
	 public static C field4 = new C();
	 
	 //인스턴스 메소드
	 public void method1() {
		 B var1 = new B();
		 C var2 = new C();
	 }
	
	 //정적 메소드
	 public static void method2() {
		 //B var1 = new B();
		 C var2 = new C();
	 }
	
	 //인스턴스 멤버 클래스
	 public class B {}
	 
	 //정적 멤버 클래스
	 public static class C {}
}
