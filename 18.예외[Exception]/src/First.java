
public class First {
	private Second second;
	public First() {
		second = new Second();
	}
	public void method1() {
		System.out.println("\t Frist.method1() 실행");
		/*
		<< Second >>
		public void method2() throws IOException;
		 */
		second.method2();
		System.out.println("\t Frist.method1() 반환");
		return;
	}
}
