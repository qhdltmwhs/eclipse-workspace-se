package client;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) throws Exception {
		
		System.out.println("-----local address-----");
		InetAddress localAddress = InetAddress.getLocalHost();
		System.out.println("local host name: " + localAddress.getHostName());
		System.out.println("local host name: " + localAddress.getHostAddress());
		
		System.out.println("-----remote address-----");
		InetAddress remoteAddress = InetAddress.getByName("www.naver.com");
		System.out.println("remote host name: " + remoteAddress.getHostName());
		System.out.println("remote host name: " + remoteAddress.getHostAddress());
		
		System.out.println("-----remote addresses-----");
		InetAddress[] remoAddresses = InetAddress.getAllByName("www.naver.com");
		for (InetAddress inetAddress : remoAddresses) {
			System.out.println(inetAddress);
		}
	}

}
