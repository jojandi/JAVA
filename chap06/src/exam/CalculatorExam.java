package exam;

public class CalculatorExam {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		calc.plus(5, 2);
		calc.minus(5, 2);
		calc.multiply(5, 2);
		calc.divide(5, 2);
		calc.remainder(5, 2);
		System.out.println("=============");
		calc.calc(5, "+", 2);
		calc.calc(5, "-", 2);
		calc.calc(5, "*", 2);
		calc.calc(5, "/", 2);
		calc.calc(5, "%", 2);
		calc.calc(5, "=", 2);
		
	}

}
