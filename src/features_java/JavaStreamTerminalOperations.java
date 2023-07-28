package features_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamTerminalOperations {

	

	public static void main(String[] args) {
		List<Person> listPersons = new ArrayList<>();

		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));

		boolean allMales = listPersons.stream().allMatch(ele -> ele.getGender().equals(Gender.MALE));
		System.out.println("Are all persons male : " + allMales);

		boolean allMatch = listPersons.stream().allMatch(ele -> ele.getEmail().endsWith("gmail.com"));
		System.out.println("Does everyone use Gmail : " + allMatch);

		boolean anyFemale = listPersons.stream().anyMatch(ele -> ele.getGender().equals(Gender.FEMALE));
		System.out.println("Is there any Female : " + anyFemale);

		boolean anyTeenager = listPersons.stream().anyMatch(ele -> ele.getAge() < 20);
		System.out.println("Is there any anyTeenager : " + anyTeenager);
		
		boolean noneMatch = listPersons.stream().noneMatch(ele -> ele.getEmail().endsWith("yahoo.com"));
		System.out.println("No one use Yahoo mail : " + noneMatch);
		
		
		List<String> collect = listPersons.stream().map(ele->ele.getEmail()).collect(Collectors.toList());
		System.out.println("List of Emails : " + collect);
		
//		listPersons.stream().collect(Collectors.groupingBy(ele->ele.getGender())).entrySet().stream()
//		System.out.println("Grouping By Genders : "+groupingGenders);
	}

}
