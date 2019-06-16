package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
public static void main(String[] args) {
	List<String> mentors = new ArrayList<>();
	mentors.add("Sam");
	mentors.add("Gopinath Jayakumar");
	mentors.add("Balaji");
	mentors.add("Koushik");
	mentors.add("Sarath");
	
	for (String eachMentor : mentors) {
		if((eachMentor.startsWith("S")||(eachMentor.endsWith("i"))))
			System.out.println(eachMentor);
	}
	for(int i =0;i<mentors.size();i++) {
		if((mentors.get(i).startsWith("S")||(mentors.get(i).endsWith("i"))))
			System.out.println(mentors.get(i));
		
	}
	
}
}
