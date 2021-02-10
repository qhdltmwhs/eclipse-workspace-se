import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ExceptionThrowMain {

	/*
	public static void main(String[] args) throws ClassNotFoundException, UnknownHostException, IOException {
		System.out.println("stm1");
		Class.forName("First");
		
		System.out.println("stm2");
		Socket socket = new Socket("www.dfsfsdyyy.com",80);
		
		System.out.println("stm3");
		First first = new First();
		first.method1();

	}
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("stm1");
		Class.forName("First");
		
		System.out.println("stm2");
		Socket socket = new Socket("www.dfsfsdyyy.com",80);
		
		System.out.println("stm3");
		First first = new First();
		first.method1();
		
	}
}
