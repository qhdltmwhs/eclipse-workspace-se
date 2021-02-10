package basic;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrameMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("나의 첫번째 프레임");
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setSize(300, 400);
		frame.setVisible(true);
		/*
		 *  Container[JFrame].setVisible(true);
		 *  	- 메인 스레드가 호출하면 [호출되면] JVM이 GUI스레드(이벤트스레드, 그래픽스레드 라고도함)를 생성
		 *  	- GUI스레드는 무한대기 하면서 이벤트와 그래픽 처리를 담당
		 *  	- Container[JFrame]는 계속떠있다.
		 *  		(JVM이 종료되지않는다)
		 */

	}

}
