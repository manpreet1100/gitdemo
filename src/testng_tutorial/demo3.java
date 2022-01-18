package testng_tutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo3 {
	
	@AfterSuite
	public void weblogincarloansuite()
	{
	System.out.println("i am lastt");	
	}
	@BeforeMethod
	public void hghghg()
	{
	System.out.println("i will come wvery time ");	
	}
	@Parameters({"URL"})
	@Test
	public void weblogincarloan(String urlname)
	{
	System.out.println("WEBLOGIN");	
	System.out.println(urlname);
	}
	
	@Test
	public void mobilelogincarloan()
	{
	System.out.println("MOBILELOGIN");	
	}
	
	@BeforeSuite
	public void mobilelogincarsuitee()
	{
	System.out.println("NO.1");	
	}
	
	@Test(enabled=false)
	public void mobilelogoutcarloan()
	{
	System.out.println("MOBILELOgout");	
	}
	@Test
	public void mobilesignloan()
	{
	System.out.println("MOBILEsign");	
	}

	@Test(dependsOnMethods= {"weblogincarloan"})
	public void loginAPIcarloan()
	{
	System.out.println("APILOGIN");	
	}

}
