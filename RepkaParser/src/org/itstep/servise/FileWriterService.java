package org.itstep.servise;

import java.io.*;

public class FileWriterService {

	private final String filePath;

	public FileWriterService() {
		 filePath = System.getProperty("user.dir")
		 +System.getProperty("file.separator")
		 +"productsInfo.txt";
	 }

	public synchronized void writeTextToFile(String text) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(filePath, true);
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
