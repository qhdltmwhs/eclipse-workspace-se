package chapter14.inputoutputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadByteExample {

	public static void main(String[] args) throws Exception {
		
		//데이터 출발지를 test1.db로 하는 바이트 기반 파일 입력 스트림을 생성
		InputStream is = new FileInputStream("test1.db");
		
		while(true) {
			//1byte씩 읽기
			int data = is.read();
			//파일끝에 도달할경우
			if(data == -1) break;
			System.out.println(data);
		}
		//입력 스트림을 닫음
		is.close();
	}

}
