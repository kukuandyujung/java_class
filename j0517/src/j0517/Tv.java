package j0517;

public class Tv { //설계도  tv 자체를 만들기 
	
	String color; //예전에 class 밑에 있는 것들은 자동으로 기본 값이 들어간다. 
	boolean power ; //기본으로 false 
	int channel; // 기본값 0
	int volume; // 기본값 0 
	
	
	void power( ) { 
		power= ! power;
		
	}
	void channelUp( ) {
		if(channel>=999) {
			channel=1;
			return;
		}
		channel++;
		
	}
	void channelDown( ) {
		if(channel<=1) {
			channel=999;
			return;
		}
		channel--;
		
	}
	void volumeUp( ) {  
		if(volume>=100) {
			volume=100;
			return;
		}
		volume++;
		
	}
	void volumeDown( ) { 
		if(volume<=0) {
			volume=0;
			System.out.println("볼륨은 0 이하로 내려가지 않습니다.");
			return;
		}
		 volume--;
		
	}

}
