package sep_14;

public class oops {
	
	int a=10;
	int b=20;
	
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void mul() {
		System.out.println(a*b);
	}
	void div() {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
	
		//classname objectname = new classname()
		
		oops methd = new oops();
		
		// calling method from object 
		
	methd.add();
	methd.sub();
	methd.mul();
	methd.div();
	
	
	}

}
