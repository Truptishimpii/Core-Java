package function;
import java.util.*;
public class function01 {
	
	static void bill(int price, int gst, int qty) {
		int gst_amt = price*qty*gst/100;
		int total_price = gst_amt+price*qty;
		System.out.println("------Gst Bill-----");
		System.out.println("Price: "+price);
		System.out.println("GST % : "+gst);
		System.out.println("Quantity: "+qty);
		System.out.println("Gst Amount : "+gst_amt);
		System.out.println("MRP include GST % : "+total_price);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Price: ");
		int price = sc.nextInt();
		
		System.out.println("Enter Product gst %: ");
		int gst = sc.nextInt();
		
	System.out.println("Enter the Quantity of Product: ");
	int qty = sc.nextInt();
		
		bill(price,gst,qty);
	}

}
