import org.junit.Test;
import static org.junit.Assert.*;

public class TestUser {
	String name = "Spike";
	User spike = new User(name);

	@Test
	public void testUserName() {
		assertEquals(spike.getUserName(), name);
	}
}