import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ExceptionCatchMain {

	public static void main(String[] args) {
		
		System.out.println("stm1-1");
		try {
			System.out.println("stm1-2");
			Class.forName("xxxx");		
			System.out.println("stm1-3");
		}catch (ClassNotFoundException e) {
			/*
			 * catch블록 ---> 예외발생시 실행되는 블록
			 * 	- 메세지출력
			 * 	- 프로그램 정상실행을 위한 코드
			 */
			System.out.println("stm1-4 [catch]");
			String errorMsg = e.getMessage();
			System.out.println("catch msg : " + errorMsg);
			System.out.println("stm1-5 [catch]");
			
			JOptionPane.showMessageDialog(null, "호갱님 죄송합니다!!");
		}
		
		System.out.println("stm2-1");
		try {
			System.out.println("stm2-2");
			Socket socket = new Socket("www.dfsfsdyyy.com",80);
			System.out.println("socket");
			System.out.println("stm2-3");
		}catch (IOException e) {
			System.out.println("stm2-4 [catch]");
			System.out.println("catch msg : " + e.getMessage());
			System.out.println("stm2-5 [catch]");
		}
		
		System.out.println("stm3-1");
		First first = new First();
		try {
			System.out.println("stm3-2");
			first.method1();
			System.out.println("stm3-3");
		}catch (IOException e) {
			System.out.println("stm3-4 [catch]");
			System.out.println("catch msg : " + e.getMessage());
			System.out.println("stm3-5 [catch]");
		}
		System.out.println("stm4");

	}

}
