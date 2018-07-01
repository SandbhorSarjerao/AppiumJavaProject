package testNGFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class Gmail extends TestBase
{
	@Test
	public void openingBrowser() throws IOException
	{
		openBrowser();
	}
	
}
