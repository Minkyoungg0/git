/* 학습 내용
 * 1. 변수 선언 및 호출
 * 2. 메소드 구현 및 호출
 * 3. 로직
 *  - 내 짝꿍 주요 키워드 - 데이터
 *  					- 문자열
 *  - "누구야 널 보니 이 키워드(변수)가 떠올라" 라는 메세지 출력 - 기능
 *  
 */

package step01;

public class Person {
	//시작을 위한 특별한 메소드
	public static void main(String[] args) { 
		//문자열 데이터
		//변수 선언 및 초기화(값 대입)
		/* 파이썬과의 차이점
		 * image = "영국 소녀"
		 * 타입 제시 없다 - 타입 제한 없음
		 * image = 3 문법 OK
		 * 
		 * js(Java Script)과의 차이점
		 * 	  image = "영국 소녀";
		 * 	  타입 제시 없다 - 타입 제한 없음
		 *    image = 3 문법 OK
		 *    
		 * RDBMS 의 sql
		 * 	image varchar2 형식으로 선언
		 *  image 컬럼에 저장 가능한 데이터는 문자열만 가능
		 *  
		 *  String : 이미 문자열을 표현 내장 타입(library로 제공)
		 *  image : 개발자가 만든 변수명
		 */
		String image = "영국 소녀";
		//image변수 사용해서 시스템 콘솔창에 출력
		/* + : 앞뒤 데이터 결합 연산자
		 * println() : 출력
		 * System.out : 프로그램이 실행되는 시스템의 콘솔창 의미
		 * JDK 내부에 내장된 library(api) 호출
		 */
		System.out.println("현수님을 보니 이 " + image + "가 떠올라");
	}
}
