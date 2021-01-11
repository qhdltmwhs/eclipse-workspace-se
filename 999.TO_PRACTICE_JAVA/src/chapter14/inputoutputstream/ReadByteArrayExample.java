package chapter14.inputoutputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadByteArrayExample {

	public static void main(String[] args) throws Exception {
		
		//데이타 출발지를 test2.db로 하는 바이트 기반 파일 입력 스트림 생성 
		InputStream is = new FileInputStream("test2.db");
		
		//길이 10인 byte배열 생성
		byte[] buffer = new byte[10];
		while(true) {
			//배열 길이만큼 읽기
			int readByteNum = is.read(buffer);
			//읽어온 바이트값을 저장할배열, 저장할 배열의 시작 인덱스값, 읽어들이는 바이트 수
			readByteNum = is.read(buffer, 0, buffer.length);
			//파일 끝에 도달했을 경우
			if(readByteNum == -1) break;
			//읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(Integer.toBinaryString(buffer[i]));
			}
			System.out.println();
		}
		//입력 스트림을 닫음
		is.close();
	}

}
