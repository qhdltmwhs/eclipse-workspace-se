package byte_stream.node_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("image.jpg");
		FileOutputStream fos = new FileOutputStream("image_copy.jpg");
		int count =0;
		while (true) {
			int readByte = fis.read();
			if(readByte == -1) break;
			//System.out.println(Integer.toBinaryString(readByte));
			fos.write(readByte);
			count++;
			//진행상황표현 카운트를 1024 * 1024 나눈 나머지가 0일때 실행
			if(count % (1024 * 1024) == 0) {
				System.out.print("★");
			}
		}
		fis.close();
		fos.close();
		System.out.println(">>> FileCopy: " + count + " bytes copy Completed");
	}

}
