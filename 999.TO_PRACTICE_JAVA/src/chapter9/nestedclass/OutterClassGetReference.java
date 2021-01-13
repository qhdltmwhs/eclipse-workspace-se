package chapter9.nestedclass;

public class OutterClassGetReference {
	
	String field = "OutterClassGetReference-field";
	public void method() {
		System.out.println("OutterClassGetReference-method");
	}
	
	public class Nested {
		String field = "Nested-field";
		public void method() {
			System.out.println("Nested-method");
		}
		
		public void print() {
			//중첩 객체 참조
			System.out.println(this.field);
			this.method();
			
			//바깥 객체 참조
			System.out.println(OutterClassGetReference.this.field);
			OutterClassGetReference.this.method();
		}
	}
}
