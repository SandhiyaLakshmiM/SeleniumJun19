package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {

		//Java Collections introduces java 1.2
		/*ArrayList obj1 = new ArrayList();
		obj1.add(10);
		obj1.add("5");*/
		//Collections Generic was introduced in java 1.5


		//List<String> obj = new ArrayList<String>();

		//After Java 1.7 it is not mandatory to mention the generic in both the sides

		List<String> mentors = new ArrayList<>();
		mentors.add("Sam");
		mentors.add("Gopinath Jayakumar");
		mentors.add("Balaji");
		mentors.add("Koushik");
		mentors.add("Sarath");
		int size = mentors.size();
		System.out.println("size of List "+size);
		for(int i=0;i<size;i++)
		System.out.println(mentors.get(i));
		mentors.add("Gopinath Jayakumar");
		System.out.println("********************************************");
		for (String mentor : mentors) {
			System.out.println(mentor);
		}
		mentors.remove("Gopinath Jayakumar");
		System.out.println("********************************************");
		for (String mentor : mentors) {
			System.out.println(mentor);
		}
		System.out.println("********************************************");
		boolean result = mentors.contains("sarath");
		System.out.println(result);
		System.out.println("********************************************");
//		mentors.clear();
		boolean status = mentors.isEmpty();
		System.out.println("Status of list "+status);
		System.out.println("********************************************");
		Collections.sort(mentors);
		for (String mentor : mentors) {
			System.out.println(mentor);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

































	}

}
