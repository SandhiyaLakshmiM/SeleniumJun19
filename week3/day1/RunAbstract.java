package week3.day1;

public class RunAbstract extends LearnAbstract {

	@Override
	public void display() {
		System.out.println("Display - Sub class");
		
	}
	public static void main(String[] args) {
//		LearnAbstract obj = new LearnAbstract();
		RunAbstract obj = new RunAbstract();
		obj.makeCall();
		obj.display();
	}
	
	
	
	
	
	
	

}
