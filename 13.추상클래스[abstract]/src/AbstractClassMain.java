abstract class AbstractClass {
	public void method1() {
		
		System.out.println("난 구상(concrete)메소드");
	}
	public abstract void method2();
}

class AbstractClassChild extends AbstractClass {

	@Override
	public void method2() {
		System.out.println("AbstractClass 추상메소드 method2()를 재정의(구현)");
	}
	
}

public class AbstractClassMain {

	public static void main(String[] args) {
		AbstractClassChild acc1 = new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		
		AbstractClass ac2 = new AbstractClassChild();
		ac2.method1();
		ac2.method2();

	}
	
}
