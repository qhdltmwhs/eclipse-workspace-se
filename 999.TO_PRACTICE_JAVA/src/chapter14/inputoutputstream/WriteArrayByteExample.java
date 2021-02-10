package chapter14.inputoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteArrayByteExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("test2.db");

		byte[] array = {10, 20, 30, 40, 50};
		
		//배열의 모든 바이트 출력
		//os.write(array);
		
		//배열의 1번 인덱스부터 3개를 출력
		//os.write(array, 1, 3);
		
		for (int i = 0; i < 256; i++) {
			os.write(i);
		}
		os.flush();
		os.close();
	}

}
