package functionConcept;
import java.util.Arrays;

public class Customer {
	
	//AC:
	//WAM:to get cart details of all the product
	//name:getCartDetails(String customerName)
	//return:String[]-->array of the product
	//non primitive data type default value is always null value.
	// primitive data type default value is always null value.
	
	public String[] getCardDetails(String customerName) {
		System.out.println("getting the cartdetails of:"+customerName);
		
		if(customerName.equals("naveen")) {
			String product[]= {"mackbook pro","Nike T-shirt","SamsungTV","Ipad"};
			return product;	
		}
		else if(customerName.equals("vijay")) {
			String product[]= {"mackbook air","iphone 17"};
			return product;			
		}
		else if(customerName.equals("Anu")) {
			String product[]= {"Keyboard"};	
			return product;	
			}
		else {
			System.out.println("customer is not found.." +customerName);
		}
		return null;	
		}

	//Switch case Assignment???
	
	
	public static void main(String[] args) {
		Customer customer= new Customer();
		String result []=customer.getCardDetails("naveen");
		System.out.println(Arrays.toString(result));
		System.out.println("cart size:"+result.length);
		

	}
}
