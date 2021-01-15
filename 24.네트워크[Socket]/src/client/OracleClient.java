package client;

import java.net.Socket;

public class OracleClient {

	public static void main(String[] args) throws Exception {
		/*
		 *  << 강사님 >> 
		 *		- oracle db 서버 ip: 182.237.126.19 
		 * 		- oracle db	서버 default port number: 1521
		 */
		
		Socket socket = new Socket("182.237.126.19", 1521);
		System.out.println("oracle db server socket: " + socket);
		
		Socket socket2 = new Socket("www.google.com", 80);
		System.out.println("google web server socket: " + socket2);
		
		Socket socket3 = new Socket("www.naver.com", 80);
		System.out.println("naver web server socket: " + socket3);
	}

}
