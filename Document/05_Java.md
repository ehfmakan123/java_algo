#4 Java 기본 문법 , 응용

1. Collection_FrameWork
	
	- 자료구조 : 컴퓨터 과학에서 효율적인 접근 및 수정을 가능케 하는 자료의 조직,관리,저장을 
			의미한다. 데이터 값의 모임 ,데이터 간의 관계 , 데이터 적용가능한 함수나 명령
	
	- 배열 : 기본적인 자료 구조 , 동일한 데이터 타입만 관리 가능 , 다형성(Polymorphism) 
		- Object를 이용하여 모든 객체 참조 가능 -> Collection Framework
		- 담을때는 편리하지만 빼낼 때는 Object로만 가져올 수 있음.
		- 런타임에 실제 객체의 타입 확인 후 사용해야 하는 번거로움.(instance of)
		- Generic을 이용한 타입 한정 ; 컴파일 타임에 저장 타입 제한 ( 형변환 번거로움 제거)
	
	* CollectionFramework 의 핵심 interface
		- List : 순서가 있는 데이터의 집합 , 중복 허락 ( ArrayList , LinkedList)
		- Set : 순서를 유지하지 않는 데이터의 집합 , 중복 X 
		- Map : Key - Value 쌍으로 데이터를 관리하는 집합 , 순서 X , Key 중복 X Value O

2. List
	
	- 특징 : 순서가 있는 데이터의 집합 , 순서가 있으므로 중복 허용 
	- 배열과 ArrayList 	
		- 배열의 장점 : 가장 기본적인 형태의 자료 구조로 간단하며 사용이 쉬움.
		- 접근 속도가 빠르다.
		- 배열의 단점 : 크기 변경 X , 추가 데이터를 위해 새로운 배열 생성 및 복제 
		- 비 순차적 데이터의 추가, 삭제 에 많은 시간이 걸린다.
	- 배열을 사용하는 ArrayList 도 태생적으로 배열의 장단점을 그대로 가져간다!!
	- LinkedList 
		- 각 요소를 Node로 정의하고 Node는 다음 요소의 참조 값과 데이터로 구성
		- 각 요소가 다음 요소의 링크 정보를 가지며 연속적으로 구성될 필요가 없다!
	- ArrayList 와 LinkedList 용도
		- 특정 클래스가 좋고 나쁨이 아닌 용도에 따라 사용
		- 소량의 데이터 사용시에는 큰 차이가 없음.
		- 정적데이터 활용 , 단순 데이터 조회용 : ArrayList
		- 동적 데이터 추가 , 삭제가 많은 작업 : LinkedList 

	* 자료 삭제시 주의사항 -> for each 구문은 Read Only!!




3.Set 
	- 특징 : 순서없이 주머니에 구슬(데이터)를 넣는 형태.
	- 순서가 없으므로 데이터를 구별할 index 가 없어 중복 허용 X
	- index를 이용한 method 사용 불가 (index가 없으니까 당연히 안됨)
	* 동일한 데이터의 기준 : equals() = true , hashCode() 값이 같을 것.

4. Map
	-특징 : Value를 하나의 Entry로 묶어서 데이터 관리
	- key : Object 형태로 데이터 중복 허락하지 않음
	- Value : Object 형태로데이터 중복이 허락 됨.

	***각각의 자료구조가 갖는 특징적인 method를 잘 기억해두자!!!***
