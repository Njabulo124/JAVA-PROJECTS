package shopping;

public class ShoppingCart {
	
	double caclulateTotal(double Price){
		double Tax = Price*0.08;
		double total = Price+Tax;
		return total;
	}
	
	double caclulateTotal(double Price, int Quantity ){
		double QuantityPrice = Price*Quantity;
		double Tax = Price*0.08;
		double total = QuantityPrice+Price+Tax;
		return total;
	}
	
	double caclulateTotal(double Price, int Quantity,double Discount ){
	
		double QuantityPriceDiscount = Price*Quantity*Discount/100;
		double Tax = Price*0.08;
		double total = QuantityPriceDiscount+Price+Tax;
		
		return total;
	}


	public static void main(String[] args) {
		ShoppingCart n = new ShoppingCart();
		System.out.println("The price ruturned in function 1 is: R"+n.caclulateTotal(1));
		System.out.println("The price ruturned in function 2 is: R"+n.caclulateTotal(100, 5));
		System.out.println("The price ruturned in function 3 is: R"+n.caclulateTotal(100, 7,50 ));
		
		

	}

}
