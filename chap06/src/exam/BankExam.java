package exam;

public class BankExam {

	public static void main(String[] args) {

		
		// scan
		Bank bank = new Bank("NH농협은행");
		
		bank.bank();
		
		// 전달인자
		Bank_ver2 bank2 = new Bank_ver2("국민은행");
		bank2.in(10000);
		bank2.out(100000);
		bank2.out(1000);
		bank2.in(8000);
		bank2.chk();
	}

}
