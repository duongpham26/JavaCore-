package Bai37_HandleFile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public interface WriteFile {
	public static void main(String[] args) {
		try {
			PrintWriter file1 = new PrintWriter(
					"C:\\Users\\phamt\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\JavaCore\\src\\Bai37_IO_Stream\\MyFolder\\file1.txt");
			file1.print("Hello ABC");
			file1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
