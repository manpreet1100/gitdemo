package testng_tutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class global_variable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop= new Properties();
		//make a file input stream object and pass the path of data.properties file
		//file input stream will read the file 
		FileInputStream fis= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\testng_tutorial\\src\\testng_tutorial\\data.properties");
        prop.load(fis); //making properties object have knowledge about the external fle
       System.out.println(prop.getProperty("browser"));// value will get from external file using the key browser
      System.out.println( prop.getProperty("url"));
      prop.setProperty("browser", "firefox"); // can change the value on runtime.. it will upload only in the console. not saved in file
//to save the output in file use file output stream 
		FileOutputStream fos= new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\testng_tutorial\\src\\testng_tutorial\\data.properties");
prop.store(fos, null); // will store the values in file 
	}

}
