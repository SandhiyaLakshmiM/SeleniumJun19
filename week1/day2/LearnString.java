package week1.day2;

public class LearnString {
	public static void main(String[] args) {
		// using object
		//		String str = new String("testleaf");
		// using literal
		String str = "testleaf software";
		int length = str.length(); // to get the length
		System.out.println(length);
		char[] charArray = str.toCharArray();// to get each character
		for(int i = 0; i < length; i++) {
			System.out.println(charArray[i]);
		}

/*		String name = "koushik";
		boolean aPresent = false;
		char[] charArray = name.toCharArray();
		for (char c : charArray) {
			if(c == 'a') {
				System.out.println("success");
				aPresent = true;
				break;
			}else{
				System.out.println("a not present");
			}
		}
		if(!aPresent) {
			System.out.println("a not present");
		}*/










	}



}
