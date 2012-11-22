package net.gageot.coverage;

import org.junit.Test;

public class ApiTest {
	@Test(expected = UnsupportedOperationException.class)
	public void should_fail_to_say_hello() {
		new Api().sayHello();
	}
}
