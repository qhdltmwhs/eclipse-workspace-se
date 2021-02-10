package byte_stream.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamMain {

	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream("KakaoTalk_Setup.exe"));
		BufferedOutputStream bos = 
				new BufferedOutputStream(
						new FileOutputStream("big_file_copy2.exe"));
		int count = 0;
		long startTime = System.currentTimeMillis();
		while (true) {
			int readbyte = bis.read();
			if(readbyte == -1) break;
			bos.write(readbyte);
			count++;
			if(count % (1024 * 1024) == 0) {
				System.out.print("★");
			}
		}
		bis.close();
		bos.close();
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println();
		System.out.println(">>>FilterStream FileCopy: " + count + " bytes Completed [took " + duration + " ms]");
	}

}
