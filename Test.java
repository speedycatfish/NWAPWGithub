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
				String question = scan.nextLine();
				CreateTest(question);
				break;
			case "stop":
				break loop;
			}
		}
		scan.close();
	}

	static void TakeTest() {

	}

	static void CreateTest(String question) {

	}
}