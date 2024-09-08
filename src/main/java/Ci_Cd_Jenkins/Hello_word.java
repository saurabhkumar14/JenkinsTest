package Ci_Cd_Jenkins;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
	
	 Properties properties = new Properties();

     // Try to load the config.properties file
     try (FileInputStream fis = new FileInputStream("config.properties")) {
         properties.load(fis);

         // Read properties
         String appName = properties.getProperty("app.name");
         String appVersion = properties.getProperty("app.version");
         String appAuthor = properties.getProperty("app.author");

         // Print the properties
         System.out.println("App Name: " + appName);
         System.out.println("App Version: " + appVersion);
         System.out.println("App Author: " + appAuthor);

     } catch (IOException e) {
         System.err.println("Error loading the config file: " + e.getMessage());
     }
}

}
