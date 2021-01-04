import java.net.Socket;

public class ExceptionMultiCatchMain {

	public static void main(String[] args) {

		System.out.println("stm1");
		Class.forName("First");
		
		System.out.println("stm2");
		Socket socket = new Socket("www.dfsfsdyyy.com",80);
		
		System.out.println("stm3");
		First first = new First();
		first.method1();

	}

}
