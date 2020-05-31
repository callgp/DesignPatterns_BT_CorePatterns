package com.gp.maven.mavendemo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
  
{
    @Test
	public void givenANameWhenHelloCalledThenReturnHellowName(){
		App app = new App();
		String result = app.hello("gp");
		Assert.assertNotNull(result);
		Assert.assertEquals("hello gp", result);
		
	}
}
