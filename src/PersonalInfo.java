
import java.util.Scanner;


public class PersonalInfo {

	public String askQuestion(String question) {
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
