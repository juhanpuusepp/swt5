import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordTests {

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    Password password0 = new Password("\"H'?`9mJ4{K");
	    String string0 = password0.toString();
	    assertEquals("\"H'?`9mJ4{K", string0);
	}

	@Test(timeout = 4000)
	public void testCalculateScoreReturningNonEmptyString() throws Throwable {
	    Password password0 = new Password("This is a medium password :/ try making it better");
	    String string0 = password0.calculateScore();
	    assertEquals(5, password0.PasswordStrength());
	    assertEquals("This is a good password :) but you can still do better", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesPassword2() throws Throwable {
	    Password password0 = new Password("This is a good password :) but you can still do better");
	    password0.Value = "This is a good password :) but you can still do better";
	    password0.Value = "@H{-h=m;/rd)7(sUCm";
	    assertEquals(6, password0.PasswordStrength());
	    password0.Value = "";
	    String string0 = password0.calculateScore();
	    assertEquals("This is a weak password :( definitely find a new one", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesPassword0() throws Throwable {
	    Password password0 = new Password("=O3<gltow<YpSnUJ");
	    String string0 = password0.calculateScore();
	    assertEquals("This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesPassword1() throws Throwable {
	    Password password0 = new Password("LcYNeW");
	    String string0 = password0.calculateScore();
	    assertEquals("This is a medium password :/ try making it better", string0);
	}

}