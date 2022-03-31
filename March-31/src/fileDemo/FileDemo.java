package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File dir1 = new File("E:\\Farzi");
		System.out.println(dir1.exists()); // true

		File file1 = new File("E:\\Farzi\\abc.txt");
		System.out.println(file1.exists()); // false

		file1.createNewFile();
		System.out.println(file1.exists()); // true

		File dir2 = new File("E:\\Farzi\\shad");
		dir2.mkdir();

		file1.delete();
		System.out.println(file1.exists()); // false

		File dir3 = new File("C:\\Users\\user\\Desktop\\Wipro-NIIT");

		if (dir3.isDirectory()) {
			String[] contents = dir3.list();
			for (String fileName : contents) {
				System.out.println(fileName);

			}

		}

	}

}
