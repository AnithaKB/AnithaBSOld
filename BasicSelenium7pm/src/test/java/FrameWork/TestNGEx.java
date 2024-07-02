package FrameWork;
import org.testng.annotations.Test;
public class TestNGEx {
	
	@Test
	public void createContact()
	{
		System.out.println("contact is created");
	}

	@Test(invocationCount=2)
	public void modifyContact()
	{
		System.out.println("contact is modified");
	}
 
	@Test
	public void deleteContact()
	{
		System.out.println("contact is deleted");
	}
}
