package Bai37_2_IO_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStream {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;

		try {

			inputStream = new BufferedReader(new FileReader("./src/Bai37_2_IO_File/xanadu.txt"));
			outputStream = new BufferedWriter(new FileWriter("./src/Bai37_2_IO_File/characteroutput.txt"));

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
