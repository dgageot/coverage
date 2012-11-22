package net.gageot.coverage;

public class Impl extends Api {
	@Override
	public String sayHello() {
		return "Hello";
	}

	@Override
	public String toBeCoveredByIt() {
		return "Impl";
	}
}