package byte_stream.filter_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * PrintStream
		 * 	문자형태로 출력기능(필터)을 하는 스트림
		 */
		
		//데이타 도착지를 print.txt로 하는 바이트 기반 파일 출력 스트림 생성
		PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));
		
		//ps.write(65);결과값은 A가 나온다.
		ps.write(65);
		ps.print("\n");
		
		ps.print(65);
		ps.print("\n");
		//프린트 메소드의 내부 진행과정
		ps.write(54);
		ps.write(53);
		ps.print("\n");
		
		ps.print(true);
		ps.print("\n");
		//프린트 메소드의 내부 진행과정
		ps.write('t');
		ps.write('r');
		ps.write('u');
		ps.write('e');
		ps.print("\n");
		
		ps.print(123456789);
		ps.print("\n");
		ps.print("123456789");
		ps.print("\n");
		
		ps.print(3.141592);
		ps.print("\n");
		//프린트 메소드의 내부 진행과정
		ps.write('3');
		ps.write('.');
		ps.write('1');
		ps.write('4');
		ps.write('1');
		ps.write('5');
		ps.write('9');
		ps.write('2');
		ps.print("\n");
		
		ps.flush();//버퍼를 비운다.
		ps.close();
		System.out.println("----------print----------");
	}

}
