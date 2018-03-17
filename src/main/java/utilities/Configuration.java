package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static Properties prop;

	public static void loadConfiguration() {
		File f = new File("src/main/resources/config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String getbrowserName() {
		return prop.getProperty("browser");
	}

	public static String getURL() {
		return prop.getProperty("url");
	}
}
