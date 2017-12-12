import javax.swing.JOptionPane;

public class Flowers extends Item{
	//attributes
	private String color;
	private String variety;
	
	//constructor (constructors are always public)
	public Flowers(double up, int q, String n, String c, String v) {
		//call superclass constructor
		super(up, q, n);
				
		//do all the things this constructor needs to do
		setColor(c);
		setVariety(v);
	}
	
	//set color
	public void setColor(String c) {
		color = c;
	}
	
	//set variety
	public void setVariety(String v) {
		variety = v;
	}
	
	//get color
	public String getColor() {
		return color;
	}
	
	//get variety
	public String getVariety() {
		return variety;
	}
	
}
