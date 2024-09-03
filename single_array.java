package array;

public class single_array {
	
	static void print_array() {
		String data[] = new String[4];
		
		data[0] = "pallavi";
		data[1] = "mahima";
		data[2] = "trupti";
		data[3] = "ashish";
		

	//	System.out.println(data[2]);
		
		for(int i=0; i< data.length; i++) {
			System.out.println(data[i]);
		}
	}

	public static void main(String[] args) {
		
		print_array();  
		
	}

}
