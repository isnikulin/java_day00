
import java.util.Scanner;

public class Program {
	private static final String WEEK_TEXT = "Week ";
	private static final String TERMINATOR = "42";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputWeek = scanner.nextLine();
		String buffer = "";
		int weekNum = 1;
		int minGrade;

		while (weekNum <= 18) {
			if (inputWeek.equals(TERMINATOR)) {
				break;
			} else if (!inputWeek.equals(WEEK_TEXT + weekNum)) {
				System.exit(putIllegalArgument());
			}
			minGrade = getMinGrade(scanner);
			buffer += inputWeek + " " + makeGraph(minGrade) + "\n";
			weekNum++;
			inputWeek = scanner.nextLine();
		}
		System.out.println(buffer);
	}

	private static String makeGraph(int minGrade) {
		String ret = "";

		for (int i = 0; i < minGrade; i++) {
			ret += "=";
		}
		ret += ">";
		return (ret);
	}

	private static int getMinGrade(Scanner scanner) {
		int min = scanner.nextInt();
		int current;

		for (int i = 0; i < 4; i++) {
			current = scanner.nextInt();
			min = (current < min) ? current : min;
		}
		scanner.nextLine();
		return (min);
	}

	private static int putIllegalArgument() {
		System.err.println("Illegal Argument");
		return (-1);
	}
}
