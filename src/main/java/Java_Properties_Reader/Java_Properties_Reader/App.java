package Java_Properties_Reader.Java_Properties_Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Ashish kumar
 * @email niits007@gmail.com
 * @website riveriq.com
 * @since Dec 7, 2018
 * @version 1.0
 */
public class App {
	public static void main(String[] args) {
		Properties prop = new Properties();
		InputStream input = null;
		try {

			if (args.length < 1) {

				System.out.println("Please Provide Property File Path");
				System.exit(0);
			}
			input = new FileInputStream(args[0]);

			// load a properties file from class path, inside static method
			prop.load(input);
			PropertiesItems obj = new PropertiesItems();

			if (prop.get("source") == null || prop.get("source").toString().equalsIgnoreCase("")) {
				System.out.println("Please Provide value for source");
			} else {
				obj.setSource(prop.getProperty("source"));
			}
			if (prop.get("feed") == null || prop.get("feed").toString().equalsIgnoreCase("")) {
				System.out.println("Please Provide value for feed");
			} else {
				obj.setFeed(prop.getProperty("feed"));
			}
			if (prop.get("delimeter") == null || prop.get("delimeter").toString().equalsIgnoreCase("")) {
				System.out.println("Please Provide value for delimeter");
			} else {
				obj.setSource(prop.getProperty("source"));
			}

			System.out.println("source =" + obj.getSource());
			System.out.println("feed =" + obj.getFeed());
			System.out.println("delimeter =" + obj.getDelimeter());

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
