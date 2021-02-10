package chapter14.inputoutputstream;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteByteExample {

	public static void main(String[] args) throws Exception {
		
		//데이터 도착지를 test1.db로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;

		//1byte씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		//버퍼에 있는 데이터를 모두 처리해라
		//Write()함수를 cpu가 처리했다고 해도 모든 데이터가 물리적으로 디스크에 전부
		//저장되지 않을 수도 있다는것이다.	
		//일부는 버퍼라는 임시 저장소에 쓰기를 대기할 수도 있다.
		//Write()한 파일을 다시 읽거나 할때는 반드시 Flush()해주는게 좋다.
		os.flush();
		//출력 스트림을 닫음
		os.close();
	}

}
