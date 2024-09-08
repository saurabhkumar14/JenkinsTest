package Ci_Cd_Jenkins;
import java.io.File;
import java.io.IOException;

public class Hello_word {

	public static void main(String[] args) {

		System.out.println("Hello World");
		try {
			// Specify the file name and path
			File file = new File("example.txt");

			// Check if the file already exists
			if (file.exists()) {
				System.out.println("File already exists.");
			} else {
				// Create the file
				if (file.createNewFile()) {
					System.out.println("File created: " + file.getName());
				} else {
					System.out.println("File creation failed.");
				}
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
