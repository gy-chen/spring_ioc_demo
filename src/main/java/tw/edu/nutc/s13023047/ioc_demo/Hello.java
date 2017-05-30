package tw.edu.nutc.s13023047.ioc_demo;

public class Hello {
	
	private String mName;
	
	public Hello(String name) {
		mName = name;
	}
	
	public void hello() {
		System.out.println("Hello " + mName);
	}
}
