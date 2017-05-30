package tw.edu.nutc.s13023047.ioc_demo;

public class Hello {
	
	private String mGreet = "Hello";
	private String mName;
	
	public Hello(String name) {
		mName = name;
	}
	
	public String getGreet() {
		return mGreet;
	}

	public void setGreet(String greet) {
		this.mGreet = greet;
	}

	public void hello() {
		System.out.println(mGreet + " " + mName);
	}
}
