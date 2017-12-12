import javax.swing.JOptionPane;

public class Supermarket {

	public static void main(String[] args) {
		//create an instance of a class
		Item paperPlates = new Item (2.99, 20, "Paper Plates");
		System.out.println(paperPlates);
		
		Produce apples = new Produce(0.99, 50, "Apples", "Dec 15", 0.5);
		System.out.println("\n" + apples);
		
		Flowers sunflowers = new Flowers(4.59, 20, "Sunflower", "Yellow", "Canadian");
		System.out.println("\n" + sunflowers);
		
		Produce pineapples = new Produce (4.98, 30, "Pineapples", "Dec 25", 3);
		System.out.println("\n" + pineapples);
		
		Flowers roses = new Flowers(5.98, 25, "Rose", "Pink", "Damask");
		System.out.println("\n" + roses);
	
		double totalCost = 0;
		
		//ask which item to buy and how many, report the total cost and print out new inventory
		String inputItem = JOptionPane.showInputDialog("Which item would you like to buy? Paper plates, apples, sunflowers, pineapples, or roses?");
		String inputNumber = JOptionPane.showInputDialog("How many would you like?");
		int number = Integer.parseInt(inputNumber);
		
		if (inputItem.equals("paper plates")) {
			int newQuantity = paperPlates.getQuantity() - number;
			paperPlates.setQuantity(newQuantity);
			totalCost = paperPlates.getUnitPrice() * number;	
		} else if (inputItem == "apples") {
			int newQuantity = apples.getQuantity() - number;
			apples.setQuantity(newQuantity);
			totalCost = apples.getUnitPrice() * number;
		} else if (inputItem == "sunflowers") {
			int newQuantity = sunflowers.getQuantity() - number;
			sunflowers.setQuantity(newQuantity);
			totalCost = sunflowers.getUnitPrice() * number;
		} else if (inputItem == "pineapples") {
			int newQuantity = pineapples.getQuantity() - number;
			pineapples.setQuantity(newQuantity);
			totalCost = pineapples.getUnitPrice() * number;
		} else if (inputItem == "roses") {
			int newQuantity = roses.getQuantity() - number;
			roses.setQuantity(newQuantity);
			totalCost = roses.getUnitPrice() * number;
		}
		
		JOptionPane.showMessageDialog(null, "You purchased " + totalCost);
		JOptionPane.showMessageDialog(null, "New paper plates values: \n" + paperPlates);
	}

}
