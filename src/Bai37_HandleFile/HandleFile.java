package Bai37_HandleFile;

import java.io.File;
import java.io.IOException;

public class HandleFile {
	public static void main(String[] args) {
		File myFolder = new File(
				"C:\\Users\\phamt\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\JavaCore\\src\\Bai37_IO_Stream\\MyFolder");
		System.out.println(myFolder.exists()); // kiểm tra thư mục có tồn tại hay không

		myFolder.mkdir(); // tạo thư mục
//		.mkdirs() -> tạo nhiều thư mục lồng nhau

		File file1 = new File(
				"C:\\Users\\phamt\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\JavaCore\\src\\Bai37_IO_Stream\\MyFolder\\file1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
