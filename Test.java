import java.util.*;

public class Test {
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		loop: while (true) {
			String input = scan.nextLine();
			switch (input) {
			case "start":
				TakeTest();
				break;
			case "create":

				CreateTest();
				break;
			case "stop":
				break loop;
			}
		}
		scan.close();
	}

	static void TakeTest() {

	}

	static void CreateTest() {
		System.out.println("Write your question");
		String question = scan.nextLine();
		System.out.println("Please type in the correct answer");
		String c = scan.nextLine();
		System.out.println("Please enter the first wrong answer");
		String w1 = scan.nextLine();
		System.out.println("Please enter the second wrong answer");
		String w2 = scan.nextLine();
		System.out.println("Please enter the third wrong answer");
		String w3 = scan.nextLine();
		System.out.println("Please enter the fourth wrong answer");
		String w4 = scan.nextLine();
		String options = c + ",~," + w1 + ",~," + w2 + ",~," + w3 + ",~," + w4;
	}
}
