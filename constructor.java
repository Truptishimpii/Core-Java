package sep_14;

public class contstructor {
	//constructor
	// without argument
	contstructor(){
		System.out.println("Hello !!");
		
	}
	
	// with arguments 
			contstructor(int num){
				System.out.println("Hello !!"+num);
				
			}
			
	public static void main(String[] args) {
	
		contstructor obj = new contstructor(15);
	}

}
