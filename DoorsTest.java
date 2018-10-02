public class DoorsTest {
	public static void main(String[] args) {
		
		Doors doors1 = new Doors(210, 90, 12, "Oak", "Brown", "1");
		
		System.out.println(doors1.getHeight());
		System.out.println(doors1.getWidth());
		System.out.println(doors1.getThickness());
		System.out.println(doors1.getMaterial());
		System.out.println(doors1.getColor());
		
		doors1.setColor("Blue");
		System.out.println(doors1.getColor());
		
		System.out.println(doors1.isOpen());
		
		doors1.setLock("2");
		
		doors1.openDoors("2");
		doors1.openDoors("3");
		doors1.closeDoors("3");
		doors1.closeDoors("2");
	}
	
	
}
