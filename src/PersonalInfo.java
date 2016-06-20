
import java.util.Scanner;


public class PersonalInfo {

	public String askQuestion(String question) {
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public String concatenateString(String string1, String string2) {
		return string1+string2;
	}
}
