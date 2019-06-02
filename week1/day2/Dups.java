package week1.day2;

public class Dups {
	
	public static void main(String[] args) {
		int[] dups = {7,1,2,6,2,7,4};	
		int length = dups.length;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j <length; j++) {
				if (dups[i] == dups[j]) {
					System.out.println(dups[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}