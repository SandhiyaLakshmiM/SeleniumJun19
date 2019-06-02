package week1.day2;

public class MoreString {
	public static void main(String[] args) {
		System.out.println("STRING BUFFER");
		StringBuffer sb=  
		new StringBuffer("Sachin Ramesh Tendulkar");
		System.out.println(sb);
		sb.append(" hi");
		System.out.println(sb.reverse());
		System.out.println("STRING");
		String str = "Sachin Ramesh Tendulkar";
		str.concat(" hi");
		System.out.println(str);
	}

}
