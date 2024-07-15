package sec01.exam01;

public class Audio implements RemoteControl {

	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio On");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Off");
	}

	@Override
	public void setVoulume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			
			volume = RemoteControl.MAX_VOLUME;
			
		} else if(volume < RemoteControl.MIN_VOLUME) {
			
			volume = RemoteControl.MIN_VOLUME;
			
		}		
		this.volume = volume;
		
		System.out.println("Audio volume : " + this.volume);
	}
	
	

}
