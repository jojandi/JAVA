package sec01.exam01;

public class SmartTv implements RemoteControl, Searchable, Ticket {

	
	int volume;
	
	@Override
	public void search(String keyword) {
		System.out.println(keyword + "을(를) 검색합니다. ");
	}
	
	
	@Override
	public void turnOn() {
		System.out.println("TV On");
	}

	@Override
	public void turnOff() {
		System.out.println("TV Off");
	}

	@Override
	public void setVoulume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			
			volume = RemoteControl.MAX_VOLUME;
			
		} else if(volume < RemoteControl.MIN_VOLUME) {
			
			volume = RemoteControl.MIN_VOLUME;
			
		}		
		this.volume = volume;
		
		System.out.println("TV volume : " + this.volume);
	}

}
