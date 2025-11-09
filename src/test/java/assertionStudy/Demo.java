package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	  String actual= "test";
	  String expected="test1";
	  
	  
	  Assert.assertEquals(actual, expected);
  }
}
