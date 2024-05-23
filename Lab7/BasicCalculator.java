import java.util.Scanner;
import java.util.StringTokenizer;

public class BasicCalculatorTester {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BasicCalculator cal = new BasicCalculator();
		String expression = sc.nextLine();
		StringTokenizer st = new StringTokenizer(expression);
		int count = 1;
		String operator = "";
		while (st.hasMoreTokens()) {
			// System.out.println(st.nextToken());
			if (count == 1) {
				cal.add(Double.parseDouble(st.nextToken()));
			} else {
				if (count % 2 == 1) {
					operator = st.nextToken();
				} else {
					switch (operator) {
						case "+":
							cal.add(Double.parseDouble(st.nextToken()));
							break;
						case "-":
							cal.substract(Double.parseDouble(st.nextToken()));
							break;
						case "/":
							cal.divide(Double.parseDouble(st.nextToken()));
							break;
						case "*":
							cal.multiply(Double.parseDouble(st.nextToken()));
							break;
					}
				}
			}
			count++;
		}
		System.out.println(cal.getResult());
	}
}

interface Calculator {
	public double getResult();

	public void clear();

	public void add(double a);

	public void substract(double a);

	public void divide(double a);

	public void multiply(double a);

}

// put your code for the BasicCalculator class below here
public class BasicCalculator implements Calculator {
	private double result;

	@Override
	public double getResult() {
		return result;
	}

	@Override
	public void clear() {
		result = 0;
	}

	@Override
	public void add(double a) {
		result += a;
	}

	@Override
	public void substract(double a) {
		result -= a;
	}

	@Override
	public void divide(double a) {
		result /= a;
	}

	@Override
	public void multiply(double a) {
		result *= a;
	}

}