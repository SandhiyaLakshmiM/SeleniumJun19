package week1.day1;

public class Car {
	static public void main(String[] args) {
		System.out.println("Welcome to Java");
		// syntax to call a class
		// ClassName object = new ClassName();
		// syntax to call a method
		// object.methodName();
		Car c = new Car();
		c.applyBrake();
		String color = c.getColor("BMW");
		System.out.println(color);
		boolean puncture = c.isPuncture("front");
		System.out.println(puncture);
	}
	private boolean isPuncture(String whichTyre) {
		return true;
	}
	
	public void applyBrake() {
		System.out.println("Applied brake");
	}
	
	public String getColor(String brand) {
		return "black";
	}
	

	
	
	
	
	
	
	
	
	
}



