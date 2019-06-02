package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String company = "aba";
		String rev = "";
		int length = company.length();
		for (int i = length-1; i >=0; i--) {
			rev = rev+company.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(company)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
