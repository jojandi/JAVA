package sec05.exam05;

public class Array {
	
	// 생성자에서 배열의 길이를 설정한 후 배열의 길이를 못 바꾸게 하기
	final int length;
	int[] arr;
	
	Array(int length){
		this.length = length;
		arr = new int[this.length];
	}

	int get(int index) {
		return arr[index];
	}
	
}
