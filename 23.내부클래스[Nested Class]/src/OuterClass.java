
public class OuterClass {
	/*
	 * 인스턴스 멤버 필드
	 */
	public int outer_member_field;
	
	//생성자
	public OuterClass() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 인스턴스 멤버 메소드
	 */
	public void out_member_method() {
		System.out.println("OuterClass.out_member_method()");
	}
	/****************외부클래스에서 내부 클래스의사용****************/
	public void oute_inner_class_use() {
		/*
		 * 1. InnerClass 객체생성
		 */
		
		//OuterClass.InnerClass innerObject = this.new InnerClass();
		InnerClass innerObject = new InnerClass();
		
		/*
		 * 2. InnerClass 객체멤버 사용
		 */
		innerObject.inner_member_field = 4535;
		innerObject.inner_member_method();
		
	}
	
	
	/*
	 * NestedClass, InnerClass [인스턴스 멤버클래스] 
	 */
	
	/****************inner class****************/
	public class InnerClass{
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/*
		 InnerClass의 사용이유
		 	- 내부클래스(객체)에서 외부클래스(객체)의
		 	  멤버변수, 멤버메소드 접근을 손쉽게 하기위해서
		 */
		public void inner_out_access() {
			
			inner_member_field = 3423423;
			outer_member_field = 3423423;
		}
	}
	/********************************/
}
