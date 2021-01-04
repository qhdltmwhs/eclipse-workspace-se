import java.io.IOException;
import java.net.Socket;

public class ExceptionMultiCatchMain {

	public static void main(String[] args) {
		System.out.println("stm1");
		try {	
		System.out.println("stm2");
		Class.forName("xxxx");
		System.out.println("stm3");
		Socket socket = new Socket("www.dfsfsdyyy.com",80);
		System.out.println("stm4");
		First first = new First();
		first.method1();
		System.out.println("stm5");
		}catch (ClassNotFoundException e) {
			System.out.println("catch ClassNotFoundException start");
			System.out.println("catch msg : " + e.getMessage());
			System.out.println("catch ClassNotFoundException end");
		}catch (IOException e) {
			System.out.println("catch IOException  start");
			System.out.println("catch msg : " + e.getMessage());
			System.out.println("catch IOException  end");
		}
		System.out.println("stm6");
	}

}
