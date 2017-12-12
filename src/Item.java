import javax.swing.JOptionPane;

public class Item {
	//attributes
	private double unitPrice;
	private int quantity;
	private String name;
	
	//methods
	//constructor
	public Item (double up, int q, String n){
		//change this to setUnitPrice after making setters!!
		setUnitPrice(up);
		//change this to setQuantity
		setQuantity(q);

		name = n;
	}
	
	//set unitPrice
	public void setUnitPrice (double up){
		if (up >= 0) {
			unitPrice = up;
		} else {
			System.out.println("Unit price cannot be negative. Default to $1.");
			unitPrice = 1.00;
		}
	}
	
	public void setQuantity (int q) {
		if (q >= 0) {
			quantity = q;
		} else {
			System.out.println("Quantity cannot be negative. Default to 0.");
			quantity = 0;
		}
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + "\nUnitPrice: $" + unitPrice + "\nQuantity: " + quantity;
	}
			
}
