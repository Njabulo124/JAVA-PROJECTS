package invoice;
import java.util.Scanner;
public class Invoice {
	private 
	String partNumber;
	String partDescription;
	int quantityPurchased;
	double pricePerItem;
	
	Invoice(){
		partNumber = "";
		partDescription = "";
		quantityPurchased = 0;
		pricePerItem = 0;
	}
		void setpartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		String getpartNumber() {
			return partNumber;
		}
		void setpartDescription(String partDescription) {
			this.partDescription = partDescription;
		}
		String getpartDescription() {
			return partDescription;
		}
		void setquantityPurchased(int quantityPurchased) {
			this.quantityPurchased = quantityPurchased;
		}
		int getquantityPurchased() {
			if(quantityPurchased<0) {quantityPurchased=0;}
			return quantityPurchased;
		}
		void setpricePerItem(double pricePerItem) {
			this.pricePerItem = pricePerItem;
		}
		double getpricePerItem() {
			return pricePerItem;
		}

	
	public static void main(String args[]) {
		InvoiceClas n = new InvoiceClas();
		Invoice in = new Invoice();
		in.setpartDescription("hammer");
		in.setpartNumber("123456");
		in.setpricePerItem(105.5);
		in.setquantityPurchased(5);
		System.out.println("part number: "+in.getpartNumber());
		System.out.println("Description: "+in.getpartDescription());
		System.out.println("Quantity: "+in.getquantityPurchased());
		System.out.println("Price Per Item: R"+in.getpricePerItem());
		System.out.println("Invoice amount :"+in.getpricePerItem()*in.getquantityPurchased());
		n.publish();
	}
}
