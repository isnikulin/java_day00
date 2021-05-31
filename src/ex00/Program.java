
public class Program {
	public static void main(String[] args) {
		int sumThis = -479598;
		int	result = 0;

		for (int i = 0; i < 6; i++) {
			result += sumThis % 10;
			sumThis /= 10;
		}
		System.out.println(result);
	}
}
