import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
//		ArrayList customers = new ArrayList();
		
//		Products product = new Products( "HeadPhone", 300);
//		
//		Orders order = new Orders(1, product);
//		
//		Customers customer1 = new Customers(1, "Rohit", order);
//		Customers customer2 = new Customers(1, "Rahul", order);
//		
    	HashMap customers = new HashMap();
    	Map<String, Integer> products = new HashMap();
    	Map<String, String> orders = new HashMap();
//		
//		map.put(1, customer1);
//		map.put(2, customer2);
//		
//		Object cstmr = map.get(1);
//		
//		System.out.println(map);
		
		Scanner  sc = new Scanner(System.in);
		Random ram = new Random();
		selectChoice();
		int input = sc.nextInt();
		int customerId = 1;
		
		while(input != 0) {
			
			switch(input) {
			case 1:
				System.out.println("Enter the username");
				String username = sc.next();
				System.out.println("Enter the password");
				String password = sc.next();
				
				Customers cst = new Customers(username, password);
				customers.put(username, password);
				break;
			
			case 2:
				System.out.println("Enter the product name");
				String productName = sc.next();
				int price = ram.nextInt(100) + 20;
				
				products.put(productName, price);
				break;
				
			case 3:
				System.out.println("Enter your username");
				String user = sc.next();
				if(customers.containsKey(user)) {
					System.out.println("Enter Your password");
					String pass = sc.next();
					if(customers.get(user).toString().equals(pass)) {
						System.out.println("Here is the list of products: \n ");
						for(String name : products.keySet()) {
							System.out.println(name + " "+products.get(name));
						}
						System.out.println("Enter the product name to add in cart ");
						createOrder(customers, user, sc.next(), orders);
						findTotalPrice(orders, products);
					}
					else {
						System.out.println("Invalid Password");
					}
				}
				else {
					System.out.println("This username does not exist.");
				}
				
				
				
			}
			selectChoice();
			input = sc.nextInt();
		}
	}

	

	private static void findTotalPrice(Map orders, Map products) {
		
	}



	private static void createOrder(HashMap customers, String user, String product, Map orders) {
		orders.put(user, product);
	}



	private static void selectChoice() {
		System.out.println("Enter 1 for adding a new customer, 2 for adding a new product, 3 for making order and 0 for exit.");
		
	}

}
