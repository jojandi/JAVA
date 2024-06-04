package exam;

public class Array_주사위 {

	public static void main(String[] args) {

		int[] dice1 = {1, 2, 3, 4, 5, 6};
		
		for(int k = 2; k <= 12; k++) {
			System.out.print("합이 "+k+"인 경우\t: ");
			for(int i = 0; i < dice1.length; i++) {
				for(int j = 0; j < dice1.length; j++) {
					if((dice1[i] + dice1[j]) == k) {
						System.out.print("["+dice1[i]+","+dice1[j]+"]");
					}
				}
			}
			System.out.println();
		}
		
	}

}
