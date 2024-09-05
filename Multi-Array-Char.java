package array;

public class multiChar {

	public static void main(String[] args) {
	
		String data[][]= new String[4][4];
		
		data[0][0]="A";
		data[1][0]="B";
		data[2][0]="C";
		data[3][0]="D";
		
		data[0][1]="E";
		data[1][1]="F";
		data[2][1]="G";
		data[3][1]="H";
		
		data[0][2]="I";
		data[1][2]="J";
		data[2][2]="K";
		data[3][2]="L";
		
		data[0][3]="M";
		data[1][3]="N";
		data[2][3]="O";
		data[3][3]="P";
		

		//System.out.println(data[2][2]);
		
		for(int i=0; i<4;i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" "+data[i][j]);
			}
			System.out.println();
		}
	}

}
