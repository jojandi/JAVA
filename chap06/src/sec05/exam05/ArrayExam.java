package sec05.exam05;

public class ArrayExam {

	public static void main(String[] args) {

		Array arr = new Array(5);
		System.out.println(arr.length);
		
		// length 변수에 final을 붙여 배열의 길이를 바꿀 수 없게
//		arr.length = 4;
//		System.out.println(arr.length);

		// 배열의 길이를 바꿀 수 없음
//		int[] a = new int[5];
//		a.length = 4;
	}

}
