package ch07;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	public abstract void drive();
	
	public abstract void stop();

	public abstract void wiper();

	// 후크(hook) 메서드 : 필요하면 갖다써라
	public void washCar() {
		
	}
	
	
	// 핵심
	// 하위 클래스에서 재정의 할 수 없게 해야한다.
	// --> final
	
	final public void run() {
		System.out.println("주행 중입니다.");
		
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
