

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo4 {
	@Parameters({"URL"})
	@Test
	public void webloginHOMEloan(String uname)
	{
	System.out.println("WEBLOGINHOME");	
	System.out.println(uname);	

	}
	
	@Test
	public void mobileloginHOMEloan()
	{
	System.out.println("MOBILELOGINHOME");	
	}

	@Test
	public void loginAPIHOMEloan()
	{
	System.out.println("APILOGINHOME");	
	}

}
