
public class Program {
	public static void main(String[] args) {
		int sumThis = 123566;
		int	result = 0;

		result += sumThis % 10;
		sumThis /= 10;
		result += sumThis % 10;
		sumThis /= 10;
		result += sumThis % 10;
		sumThis /= 10;
		result += sumThis % 10;
		sumThis /= 10;
		result += sumThis % 10;
		sumThis /= 10;
		result += sumThis % 10;

		System.out.println(result);
	}
}
