package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {

		Avante avante = new Avante();
		Spark spark = new Spark();
		
		Driver driver = new Driver();
		
		// Car 타입으로 자동 형변환 되어서 들어감
//		driver.run((Car)avante);
		driver.run(avante);
		driver.run(spark);
		
	}

}
