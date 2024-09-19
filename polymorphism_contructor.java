package method;
//calling contructor through object & overloading through datatypes.
public class polymorphism1 {

	public polymorphism1(){
		System.out.println("Welcome Users !");
	}
	public polymorphism1(String Name){
		System.out.println("Name: "+ Name);
	}
	public polymorphism1(int age, float height){
		System.out.println("Age: "+age);
		System.out.println("height: "+height);
	}
	
	public static void main(String[] args) {
		
		polymorphism1 polymorphism1= new polymorphism1();
		polymorphism1 polymorphism2= new polymorphism1("Aniket");
		polymorphism1 polymorphism3= new polymorphism1(20,5.5f);

	}
}
