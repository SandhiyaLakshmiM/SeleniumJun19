package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> mentors = new LinkedHashSet<>();
		mentors.add("Sam");
		mentors.add("Gopinath Jayakumar");
		mentors.add("Balaji");
		mentors.add("Koushik");
		mentors.add("Sarath");
		mentors.add("Balaji");
		for (String eachmentor : mentors) {
			System.out.println(eachmentor);
		}
		System.out.println("==================================");
		
		List<String> mentorList = new ArrayList<>(mentors);
//		mentorList.addAll(mentors);
		System.out.println(mentorList.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
