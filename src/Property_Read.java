import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f= new File("E:/Data_driven/config.properties");
		FileInputStream fis= new FileInputStream(f);
		
		Properties pro= new Properties();
		pro.load(fis);
		
		String URL=pro.getProperty("URL");
		
		System.out.println("property value are  "+ URL);
		
		FileOutputStream fos= new FileOutputStream("E:/Data_driven/config.properties");
		pro.setProperty("firstname", "Ankit");
		pro.setProperty("Last name", "Aggarwal");
		pro.store(fos, "some data has been inserted into file");
		

	}

}
