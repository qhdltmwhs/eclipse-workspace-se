import java.io.IOException;

public class FirstSecondExceptionThrowMechanismMain {

	public static void main(String[] args) throws NullPointerException, IOException {
		System.out.println("1.main thread start");
		First first = new First();
		
		System.out.println("2.main thread first.method1()호출");
		/*
		<< First >>
		public void method1() throws NullPointerException;
		 */
		first.method1();
		System.out.println("3.main thread first.method1()반환");
		return;
	}

}
