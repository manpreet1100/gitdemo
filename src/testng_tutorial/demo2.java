package testng_tutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	
	@BeforeTest
	public void demo1()
	{
	System.out.println("i will come first");	
	}

	

	@AfterTest
	public void demo2()
	{
	System.out.println("i will execute last");	
	}

}
