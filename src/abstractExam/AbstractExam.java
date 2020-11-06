package abstractExam;

public class AbstractExam {

	public static void main(String[] args) {
		
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		
		// 부모 객체변수로 참조했기 때문에 자식 인스턴스의 멤버는 접근하지 못한다.
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
		
		
		Tank tank = new Tank();
		tank.seizeMode();
	}

}

// 추상 클래스, 인스턴스 생성x
abstract class Unit{
	int x, y;
	// 추상 메서드, 선언부만 구현한다.
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{
	// 추상 메서드는 무조건 구현을 해야하거나 자식클래스를 추상클래스로 지정해야한다
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("병사가  x만큼" + x + "y만큼"+ y + "만큼 이동했습니다.");
	}
}


class Tank extends Unit{
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("탱크가  x만큼" + x + "y만큼"+ y + "만큼 이동했습니다.");
	}
	// 자식클래스만의 멤버메서드
	void seizeMode() {
		System.out.println("시즈모드 개시");
	}
}

class Dropship extends Unit{
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("드랍쉽가  x만큼" + x + "y만큼"+ y + "만큼 이동했습니다.");
	}
}



