import java.util.Scanner;


public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What would you like to do?");
		System.out.println("1. Calculate flower bed circumference");
		System.out.println("2. Find out some personal information");
		System.out.println("3. Find out how much it will cost to call a friend");
		System.out.println("4. Exit");
		Scanner sc  = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int option = sc.nextInt();
			switch (option) {
				case 1: processOption1();
						break;
				case 2: processOption2();
						break;
				case 3: processOption3();
						break;
				case 4: System.out.println("Thank you for playing.");
					return;
				default: System.out.println("Sorry, didn't recognise that option");
						 System.out.println("Do you want to continue? Y/N");
						break;
			}
			System.out.println("Well done! What else would you like to do? Please enter a valid option.");
		}
	}
	
	private static void processOption1() {
		System.out.println("Please input the flower bed radius.");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		FlowerBed flowerBed = new FlowerBed();
		double circumference = flowerBed.calculateCircumference(radius);
		System.out.println("The cirumference is " + Double.toString(circumference));
		return;
	}
	
	private static void processOption2() {
		PersonalInfo personalInfo = new PersonalInfo();
		String question1 = "What is your name?";
		String name = personalInfo.askQuestion(question1);
		Integer age = 0;
		String nextQuestion = personalInfo.concatenateString(personalInfo.concatenateString("What is your address, ",name),"?");
		String address = personalInfo.askQuestion(nextQuestion);
		System.out.println(personalInfo.concatenateString(personalInfo.concatenateString(name,", you live at "),address));
		return;
	}
	
	private static void processOption3() {
		System.out.println("How much does call 1 cost per minute?");
		Scanner sc = new Scanner(System.in);
		Double cost1 = sc.nextDouble();
		System.out.println("How long did call 1 take in minutes?");
		Integer length1 = sc.nextInt();
		TelephoneCall telephoneCall = new TelephoneCall();
		Double totalCost1 = telephoneCall.calculateCost(cost1,length1);
		System.out.println("How much does call 2 cost per minute?");
		Double cost2 = sc.nextDouble();
		System.out.println("How long did call 2 take in minutes?");
		Integer length2 = sc.nextInt();
		Double totalCost2 = telephoneCall.calculateCost(cost2,length2);
		System.out.println("How much does call 3 cost per minute?");
		Double cost3 = sc.nextDouble();
		System.out.println("How long did call 3 take in minutes?");
		Integer length3 = sc.nextInt();
		Double totalCost3 = telephoneCall.calculateCost(cost3,length3);
		System.out.println("The total cost for call 1 was "+totalCost1.toString());
		System.out.println("The total cost for call 2 was "+totalCost2.toString());
		System.out.println("The total cost for call 3 was "+totalCost3.toString());
		Double totalCost = totalCost1 + totalCost2 + totalCost3;
		System.out.println("THe total cost over all was "+totalCost.toString());
		return;
	}

}
