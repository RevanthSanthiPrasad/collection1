package collection_1;

public class Shirt {
	private String brand;
	private int price;
	private String color;
	private boolean isChecked;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	public boolean getChecked() {
		return isChecked;
	}
	public Shirt(String brand, int price, String color, boolean isChecked) {
		this.brand = brand;
		this.price = price;
		this.color = color ;
		this.isChecked = isChecked;
	}
	public String toString() {
		return "Brand= "+brand+", Price= "+price+", Color= "+color+", Checked= "+isChecked;
	}
}
