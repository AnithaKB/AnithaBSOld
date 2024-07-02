package FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	@Test
	public void m2() {
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals(false, false);
		System.out.println("step3");
		System.out.println("step4");
	}
	@Test
	public void m1() {
		String ExpData = "Jspiders";
		String ActData = "Qspiders";
		
		Assert.assertEquals(ExpData, ActData);
	}
  
		
	
	
	
}
