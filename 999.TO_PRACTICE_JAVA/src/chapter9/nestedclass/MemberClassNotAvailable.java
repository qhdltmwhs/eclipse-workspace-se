package chapter9.nestedclass;

public class MemberClassNotAvailable {
	public int field1;
	public void method1() {}
	
	public static int field2;
	public static void method2() {}
	
	public class B{
		public void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	public static class C {
		public void method() {
			//인스턴스필드와 메소드에는 접근할수 없음
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
			
			
		}
	}
}
