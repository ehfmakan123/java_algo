#3 Java 기본 문법 , 응용

1. Exception Handling
	- 에러와 예외
		- 어떤 원인에 의해 오동작 혹은 비정상 종료되는 경우.
		- 심각도에 따른 분류 
			- 에러 : 메모리 부족 , stack overflow와 같이 발생시 복구 X
				 프로그램 비정상 종료를 막을 수 없음 -> 디버깅 필요.
			- Exception : 읽으려는 파일이 없거나 네트워크 연결 안되는등 비교적 상태 약함
					프로그램 코드에 의해 수습 가능!	
		- ExceptionHandling : 예외 발생시 프로그램 비 정상 종료를 막고 정상적 실행상태 유지.

	- checked Exception : 예외에 대한 대처 코드가 없으면 컴파일 X
	- Unchecked Exception : 컴파일은 된다. (Runtime Exception 의 하위 클래스)

	- try ~ catch(exception e) 구문을 통해 해결.
		- try 블록에서 예외 발생 -> JVM이 해당 Exception 클래스의 객체 생성 후 던짐(throw)
		- 던져진 Exception 처리 할 수 있는 catch 블록에서 받은 후 처리
		- 정상 처리시 try catch 블록을 벗어나 다음 순서 진행
		- try 블록에서 어떠한 예외도 발생하지 않은 경우 catch문 건너뛰고 실행.
		- 하나의 try에 여러개의 catch 추가 가능. (다중 예외 처리)
	- Throwable 주요 메서드
		- getMessage() : 발생된 예외에 대한 구체적인 메시지 반환
		- getCause() : 예외의 원인이 되는 Trhowable 객체 또는 null 반환
		- printStackTrace() : 에외가 발생된 메서드가 호출되기까지 메서드 호출 스텍 출력.
	* 다중예외 처리 try catch 문 유의사항
		- JVM이 던진 예외는 catch문장을 찾을 때 다형성 적용됨
		- 상위타입 예외가 먼저 선언될 시 뒤의 catch블록은 무시
		- 상속관계 없는 경우 무관.
		- 상속관계에서는 작은범위에서 큰 범위 순으로 정의 ( 자식 -> 부모)

	* try ~ catch 문에 finally 블록을 추가할 수 있다 : 예외 발생여부와 상관없이 실행.
		- 주요목적 : try 블록에서 사용한 리소스 반납
		- 생성된 시스템 자원 반납하지 않으면 장래 resource leak 발생가능 -> close 처리.

	* try with resource
		- jdk 1.7 이상에서 리소스 자동 close 처리.
		- try 선언문에 선언된 객체들에 대해 자동 close 호출(finally 역할)
			- 단 해당 객체들이  AutoCloseable interfacec 구현..
		- 해당 객체는 try블록에서 다시 할당 X

	* throws 키워드를 통한 위임
		- 메서드에서 처리해야 할 하나 이상의 예외를 호출한 곳 으로 전달
		- 예외가 없어지는거싱 아니라 단순히 전달됨.
		- 예외를 전달받은 메소드는 다시 예외 처리의 책임 발생
		- 처리하려는 예외의 조상 타입으로 throws 처리 가능.
	- 사용자 정의 Exception 선언 가능..
