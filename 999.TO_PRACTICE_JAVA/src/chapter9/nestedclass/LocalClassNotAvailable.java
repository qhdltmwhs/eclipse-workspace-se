package chapter9.nestedclass;

public class LocalClassNotAvailable {
	public void method(int arg) {
		int localVariable = 1;
		
		//Local variable arg defined in an enclosing scope must be final or effectively final
		//arg = 100;
		//localVariable = 100;
		
	    class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
