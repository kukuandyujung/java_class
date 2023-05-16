package j0516;

import java.util.Scanner;

public class C0516_05 {

	public static void main(String[] args) {
		// 리모콘 그림 그리기

		// 1,2,3,4,5,6,7,8 채널 바꾸기
		// channelUp, channelDown, 이전 보기, 자막 버튼
		// volumeUp, volumeDown, 음소거
		// 전원
		// 메서드 변수() 이렇게 되어있는 것
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int tempVolume =0; //임시 볼륨 저장변수 
		// 객체 선언
		Tv t = new Tv();

		while (true) {
			System.out.println("[ 리모콘 프로그램 ]");
			System.out.println("1. 전원 on/off");
			System.out.println("2. 채널 up");
			System.out.println("3. 채널 down");
			System.out.println("4. 볼륨 Up");
			System.out.println("5. 볼륨 Down");
			System.out.println("6. 음소거");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				t.power(); // 객체 사용 방법 참조변수명.메서드명
				if (t.power == true) {
					System.out.println("전원 On 되었슴돠");
				} else {
					System.out.println("전원 Off");
				}
				System.out.println();
				break;

			case 2:
				if (t.power == false) {
					System.out.println("전원을 On 해야 기능이 구동됩니다.");
					break;
				}
				t.channelUp();
				System.out.println("현재채널: " + t.channel); // 채널 번호를 움직인다
				System.out.println();
				break;

			case 3:
				if (t.power == false) {
					System.out.println("전원을 On 해야 기능이 구동됩니다.");
					break;
				}
				t.channelDown();
				System.out.println("현재채널: " + t.channel); // 채널 번호를 움직인다
				System.out.println();
				break;
				
			case 4:
				if (t.power == false) {
					System.out.println("전원을 On 해야 기능이 구동됩니다.");
					break;
				}
				t.volumeUp();
				System.out.println("현재소리크기: " + t.volume); 
				System.out.println();
				break;
			case 5:
				if (t.power == false) {
					System.out.println("전원을 On 해야 기능이 구동됩니다.");
					break;
				}
				t.volumeDown();
				System.out.println("현재소리크기: " + t.volume); 
				System.out.println();
				break;
			case 6:
				if (t.power == false) {
					System.out.println("전원을 On 해야 기능이 구동됩니다.");
					break;
				}
				
				if(t.volume ==0) {
					t.volume = tempVolume ; //임시 볼륨 높이를 입력
					System.out.println("움소거 해제");
					System.out.println("현재 볼륨: "+ t.volume);
				}else {
					tempVolume = t.volume; //현재 볼륨 높이를 저장 
					t.volume = 0; 
					System.out.println("음소거 실행:"); 
					System.out.println("현재 볼륨: "+ t.volume);
				}
				break;
			}// switch
		}//while

	}

}
