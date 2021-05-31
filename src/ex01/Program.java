
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int input = scanner.nextInt();
		boolean isInputPrime = true;
		int exit_code = 0;
		int steps = 0;
		int sqrt;

		if (input <= 1) {
			exit_code = putIllegalArgument();
		} else {
			sqrt = mySqrt(input);
			for (int i = 2; i <= sqrt + 1; i++) {
				steps++;
				if (input % i == 0) {
					isInputPrime = false;
					break;
				}
			}
			System.out.println(isInputPrime + " " + steps);
		}
		System.exit(exit_code);
	}

	private static int mySqrt(int input) {
		long start = 1;
		long end = input;
		long ret = 0;
		long mid;

		while (start <= end) {
			mid = (start + end) / 2;
			if (mid * mid == input) {
				return ((int) mid);
			} else if (mid * mid < input) {
				start = mid + 1;
				ret = mid;
			} else {
				end = mid - 1;
			}
		}
		return (int) ret;
	}

	private static int putIllegalArgument() {
		System.err.println("Illegal Argument");
		return (-1);
	}
}
