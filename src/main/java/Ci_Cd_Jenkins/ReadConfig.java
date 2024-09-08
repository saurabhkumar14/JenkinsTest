package Ci_Cd_Jenkins;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    public static void main(String[] args) {
        // Create a Properties object
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
