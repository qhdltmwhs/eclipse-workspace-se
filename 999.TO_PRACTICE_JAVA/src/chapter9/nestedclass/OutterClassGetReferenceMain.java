package chapter9.nestedclass;

public class OutterClassGetReferenceMain {

	public static void main(String[] args) {
		OutterClassGetReference outter = new OutterClassGetReference();
		OutterClassGetReference.Nested nested = outter.new Nested();
		nested.print();

	}

}
