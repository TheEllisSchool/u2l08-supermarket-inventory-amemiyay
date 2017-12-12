import javax.swing.JOptionPane;

public class Produce extends Item {
	//attributes
	private String expiration;
	private double weight;
	
	//methods
	//constructor
	public Produce (double up, int q, String n, String exp, double w) {
		//call superclass constructor
		super(up, q, n);
		
		//do all the things this constructor needs to do
		setExpiration(exp);
		setWeight(w);
	}
	
	//set expiration date
	public void setExpiration(String exp) {
		expiration = exp;
	}
	
	//set weight
	public void setWeight(double w) {
		if (w > 0) {
			weight = w;
		} else {
			System.out.println("Weight must be positive.");
		}
	}
	
	//get expiration date
	public String getExpiration() {
		return expiration;
	}
	
	//get weight
	public double getWeight() {
		return weight;
	}

}
