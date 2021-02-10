import java.util.Scanner;

import javax.swing.JOptionPane;

class ControlStopThread extends Thread {
	private boolean isPlay;
	private int count;
	
	public ControlStopThread() {
		isPlay = true;
		count = 0;
	}
	
	public boolean isPlay() {
		return isPlay;
	}

	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}

	@Override
	public void run() {
		while (isPlay) {
			System.out.print("A");
			System.out.print("B");
			System.out.print("C");
			System.out.print("D");
			System.out.print("E");
			System.out.print("F");
			System.out.print("G");
			System.out.print("H");
			System.out.print("I");
			System.out.print("J");
			System.out.print("K");
			System.out.print("L");
			System.out.print("M");
			System.out.print("N");
			System.out.print("O");
			System.out.print("P");
			System.out.print("Q");
			System.out.print("R");
			System.out.print("S");
			System.out.print("T");
			System.out.print("U");
			System.out.print("V");
			System.out.print("W");
			System.out.print("X");
			System.out.print("Y");
			System.out.print("Z");
			System.out.println();
			
		}
		return; //스레드가 JVM반환
	}
}
public class ControlStopThreadMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("1.main");
		ControlStopThread cst = new ControlStopThread();
		cst.setName("stop스레드");
		System.out.println("2.main");
		cst.start();
		
		String intPutNo= JOptionPane.showInputDialog("스레드를 죽일방법을선택하세요[1.stop 2.isPlay 변수변경]");
		
		int stopNo = Integer.parseInt(intPutNo);
		
		
		switch (stopNo) {
		case 1:
			/*
			 *  case 1
			 */
			cst.stop(); //호출한순간 종료 되어 비추
			break;

		case 2:
			/*
			 *  case 1
			 */
			cst.setPlay(false); // 조건을 걸어 종료 (조건을 만족시키기전까지 실행됨) 
			break;
		}
		System.out.println();
		System.out.println("99.main");
		
	}

}
