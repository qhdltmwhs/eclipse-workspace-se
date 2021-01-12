package char_stream;

import java.io.FileWriter;

public class FileWriteMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("fileWriter.txt");
		fw.write(41000);
		fw.write('김');
		fw.write('A');
		
		fw.flush();

	}

}
