package exam;

import java.util.Scanner;

public class Tv {
	/*
	 ~ TV를 만들자! ~
	 	전원
		볼륨 up/down 0~10
		>> 볼륨의 범위를 벗어나지 못하게 해주세요
		채널 up/down/직접입력
		정보보기 : 현재 전원상태, 볼륨, 채널 정보 출력
	 */
	Scanner scan = new Scanner(System.in);
	
	boolean isOn = false;
	int volume = 5;
	int channel = 1;
	
	void tv() {
		while(isOn) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 볼륨 조절 | 2. 채널 조절 | 3. 정보보기 | 4. 전원 종료");
			int you = scan.nextInt();
			if(you == 1) {
				volume();
			} else if(you == 2) {
				channel();
			} else if(you == 3) {
				info();
			} else if(you == 4) {
				off();
			} else {
				System.out.println("존재하지 않는 선택지입니다. ");
			}
		}
	}
	
	boolean on() {
		System.out.println("전원을 켭니다. ");
		isOn = true;
		return isOn;
	}
	boolean off() {
		System.out.println("전원을 끕니다. ");
		isOn = false;
		return isOn;
	}
	
	void info() {
		if(isOn) {
			System.out.println("전원 : ON");
			System.out.println("볼륨 : " + volume);
			System.out.println("채널 : " + channel);
		} else {
			System.out.println("전원 : OFF");
			System.out.println("볼륨 : " + volume);
			System.out.println("채널 : " + channel);
		}
	}
	
	void volume() {
		while (true) {
			System.out.println("~ 볼륨 조절!(1. UP | 2. DOWN | 3. 종료) ~");
			System.out.println("볼륨 : " + volume);
			int v = scan.nextInt();
			if(v == 1) {
				volume += 1;
				
				if(volume <= 10) {
					System.out.println("volume : " + volume);
				} else {
					System.out.println("볼륨은 10까지 입니다. ");
					volume = 10;
				}
				
			} else if(v == 2) {
				volume -= 1;
				
				if(volume >= 0) {
					System.out.println("volume : " + volume);
				} else {
					System.out.println("볼륨은 0부터 입니다. ");
					volume = 0;
				}
				
			} else if(v == 3) {
				System.out.println("볼륨 조절을 종료합니다. ");
				break;
			} else {
				System.out.println("존재하지 않는 선택지입니다.");
			}
		}
	}
	
	void channel() {
		while (true) {
			System.out.println("~ 채널 조절!(1. UP | 2. DOWN | 3. 입력 | 4. 종료) ~");
			System.out.println("채널 : " + channel);
			int c = scan.nextInt();
			if(c == 1) {
				channel += 1;
			} else if(c == 2) {
				channel -= 1;
				
				if(channel == 0) {
					System.out.println("존재하지 않는 채널입니다. ");
					channel = 1;
				}
				
			} else if(c == 3) {
				System.out.println("원하는 채널을 입력하세요. ");
				channel = scan.nextInt();
				if(channel <= 0) {
					System.out.println("존재하지 않는 채널입니다. ");
					System.out.println("1번 채널로 갑니다. ");
					channel = 1;
				}
			} else if(c == 4) {
				System.out.println("채널 조절을 종료합니다. ");
				break;
			}else {
				System.out.println("존재하지 않는 선택지입니다.");
			}
		}
	}
	
	
	
	
}
