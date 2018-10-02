
public class Doors {

	private int height; //height
	private int width; //width
	private int thickness; //thickness
	private String material; //material
	String color; //color
	String lock; //lock
	
	boolean isOpen = false; //Doors are currently closed
	
	public Doors(int height, int width, int thickness, String material, String color, String lock) {
		this.height = height;
		this.width = width;
		this.thickness = thickness;
		this.material = material;
		this.color = color;
		this.lock = lock;
	}
	
	int getHeight() {
		return height;
	}
	
	int getWidth() {
		return width;
	}
	
	int getThickness() {
		return thickness;
	}
	
	String getMaterial() {
		return material;
	}
	
	String getColor() {
		return color;
	}
	
	String getLock() {
		return lock;
		
	}
	void setColor(String color) {
		this.color = color;
	}
	void setLock(String lock) {
		this.lock = lock;
	}
		
	boolean isOpen() {
		return isOpen;
		
	}

	
	void openDoors(String key){
		assert key != "0" : "No takich drzwi to nie ma na pewno";
		if(isOpen==true)
			System.out.println("Doors are already opened"); 
		else if(isOpen==false) {
			if (key.equals(lock)) {
				isOpen = true;
				System.out.println("You open the doors");}
				else{
					System.out.println("Wrong key");}
		}
		
	}
	
	void closeDoors(String key){
		assert key != "0" : "No takich drzwi to nie ma na pewno";
		if(isOpen==false)
			System.out.println("Doors are already closed"); 
		else if(isOpen==true) {
			if (key.equals(lock)) {
			isOpen = false;
			System.out.println("You close the doors");}
			else {
				System.out.println("Wrong key");
			}
		}
	}
	
	
}
