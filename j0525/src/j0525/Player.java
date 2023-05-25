package j0525;

public abstract class Player {
	int volume;

	// 추상 클래스는 객체 선언이 안 된다. 
	// 미완성 메소드
	abstract void play();

	abstract void stop();

	// 완 메
	void pause() {

	}

}
