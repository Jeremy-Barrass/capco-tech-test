import org.junit.Test;
import static org.junit.Assert.*;

public class TestUser {
	User spike = new User("Spike");

	@Test
	public void testUserName() {
		assertEquals(spike.getUserName(), "Spike");
	}
}