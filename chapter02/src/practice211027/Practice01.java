package practice211027;

public class Practice01 {

	public static void main(String[] args) {
		
	  /* 클래스는 객체의 설계도이다.
	   * 
	   * '객체의 상태(속성)'은 '클래스의 멤버변수'로 선언한다.
	   * 클래스명은 대문자로 시작하는 것이 좋다.
	   * 자바 파일 하나에 클래스는 여러개 가능하나 public 은 하나
	   * 
	   * 함수란(function)
	   * 
	   * 하나의 기능을 수행하는 일련의 코드 
	   * 구현된(정의된) 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 제어가 반환
	   * 
	   * 함수는 이름, 매개변수, 반환값(return), 함수 몸체(body)로 구성됨
	   * 
	   */
		
		/* 함수 호출과 스택 메모리
		 * 
		 * 스택(임시사용 메모리): 함수가 호출될 때 지역 변수들이 사용하는 메모리
		 * 함수의 수행이 끝나면 자동으로 반환되는 메모리
		 */
		
		/* 메서드 = 멤버함수
		 * 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
		 * 멤버함수(member function)이라고도 함
		 * 메서드를 구현함으로써 객체의 기능이 구현됨
		 */
	
		/*
		 * 인스턴스(instance)생성과 힙 메모리(heap memory)
		 * 
		 * 인스턴스(instance)
		 * 
		 * - 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어 놓은 코드 상태
		 * (설계도면)입니다.
		 * 
		 * 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버변수 값을 가지게 됩니다.
		 * 예) 학생의 클래스에서 생성된 각각의 인스턴스는 각각 다른 이름, 학번, 학년 등의 값을 가지게 됩니다.
		 * new 키워드를 사용하여 인스턴스 생성
		 * 
		 * 
		 * 힙 메모리(heap memory)
		 * 
		 * - 생성된 인스턴스는 동적 메모리(heap memory)에 할당됨
		 * - 하나의 클래스로부터 여러 개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됨 
		 */
		
		/*
		 * 용어 정리
		 * 
		 * 객체 : 생성된 인스턴스
		 * 클래스 : 객체를 프로그래밍 하기위해서 코드로 정의해 놓은 상태
		 * 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
		 * 멤버 변수: 클래스의 속성, 상태, 특성
		 * 메서드 : 멤버변수를 이요하여 클래스의 기능을 구현한 함수
		 * 참조  변수 : 메모리에 생성된 인스턴스를 가리키는 변수
		 * 참조 값 : 생성된 인스턴스의 메모리 주소값
		 */
		/*
		 * 생성자(constructor)
		 * 
		 * 객체를 생성할 때 new키워드와 함께 사용 - new Student();
		 * 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new와 함께 호출
		 * 객체가 생성될 때 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출 함
		 * 생성자는 반환 값이 없고, 
		 * 생성자의 이름은 클래스의 이름과 동일하게 해야한다.
		 * 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private으로 선언되는 경우도 있다.
		 * 
		 * 
		 * 
		 * 기본 생성자(default constructor)
		 * 
		 * 클래스에는 반드시 적어도 하나 이상의 생성자가 존재한다.
		 * 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있다.
		 * 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어 준다.
		 * public Student(){}
		 * 
		 */
		/*
		 * 여러가지 생성자를 정의하는 생성자 오버로딩(overloading)
		 * 
		 * 생성자 정의하기
		 * 
		 * 생성자를 구현해서 사용할 수 있음
		 * 클래스에 생성자를 따로 구현하면 기본 생성자 (default constructor)는 제공되지 않음
		 * 생성자를 호출하는 코드(client 코드)에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음
		 */
		
		/*
		 * 참조 자료형 변수
		 * (String, Student, Date 등)
		 * 
		 * 클래스 형으로 변수를 선언한다.
		 * 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만, 
		 * 참조 자료형은 클래스에 따라 다르다.
		 * 참조 자료형을 사용할 때는 해당 변수에 대해 생성하여야한다.
		 * (String 클래스는 예외적으로 생성하지 않고 사용할 수 있음)
		 * 
		 * 
		 * 
		 * 참조 자료형 정의하여 사용하기
		 *
		 * 학생(Student)과 과목(Subject)에 대한 클래스를 분리하여 사용하고 Subject 클래스를 활용하여
		 * 수강한 과목들의 변수의 타입으로 선언
		 */
		
		
		/*
		 * 접근 제어 지시자(access modifier)와 정보은닉(information hiding) 
		 * 
		 * 접근 제어 지시자(access modifier)
		 * 
		 * : 클래스 외부에서 클래스의 멤버변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
		 * 
		 * private : 같은 클래스 내부에서만 접근 가능(외부 클래스, 상속 관계의 클래스에서도 접근 불가)
		 * 아무것도 없음(default) : 같은 패키지 내부에서만 접근 가능( 상속관계라도 패키지가 다르면 접근 불가)
		 * protected : 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
		 * public : 클래스의 외부 어디서나 접근할 수 있음
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
