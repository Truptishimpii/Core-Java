package method;
// polymorphism 
public class method_overloading {
	// through constructor 
	
	void info() {
		System.out.println("Hello Users !");
	}
	
	void info(String Name) {
		System.out.println("Name: "+Name);
	}
	
	void info(int age, float height) {
		System.out.println("Age : "+age);
		System.out.println("height : "+height);
	}
	
	public static void main(String[] args) {
		method_overloading method = new method_overloading();
		// method(name created) is object 
	
		method.info();
		method.info("Trupti");
		method.info(20,5.3f);
		
	}
}
