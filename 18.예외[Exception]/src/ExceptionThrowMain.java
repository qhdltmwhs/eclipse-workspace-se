import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ExceptionThrowMain {

	public static void main(String[] args) throws ClassNotFoundException, UnknownHostException, IOException {
		System.out.println("stm1");
		Class.forName("xxxx");
		System.out.println("stm2");
		Socket socket = new Socket("www.dfsfsd.com",80);

	}

}
