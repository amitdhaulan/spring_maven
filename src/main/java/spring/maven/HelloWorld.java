package spring.maven;

public class HelloWorld {
	String message1, message2;

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void init() {
		System.out.println("HelloWorld init.");
	}

	public void destroy() {
		System.out.println("HelloWorld destroy.");
	}
}
