import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
		Scanner FindQuestion = new Scanner("questions.txt");
		ArrayList<Question> Questions = new ArrayList<Questions>;
		while(FindQuestion.hasNextLine){
			String questionMsg = FindQuestion.nextLine();
			String[] options = FindQuestion.nextLine().split(",~,");
			Question question = new Question(questionMsg, options);
			Questions.Add(question);
		}
		
		System.out.println("");
	}
public class Question
{
  private String QuestionMsg;
  private String[] Answers ;
  public Questions(String q, String[] answers)
  {
    Answers = answers;
    QuestionMsg = q;
  }
 static void AskQuestion() {
    answer = Answers[0];
    shuffledAnswers = shuffleArray(Answers);
    System.out.println(QuestionMsg);
    System.out.println(shuffledAnswers.join("/n"));
	 Scaner answerInput = new Scanner(System.in);
	String userAnswer = shuffledAnswers[answerInput.nextLine()-1];
	 if (userAnswer.Equals(answer){
	 System.out.println("Correct!");
	 }
	     else {
		     System.out.println("Nope!");
	     }
 }
	
static String[] shuffleArray(String[] ar)
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
      return ar;
    }
  }
}
