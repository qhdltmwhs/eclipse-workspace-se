package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		/*
		 * int 타입의 배열변수 선언과 배열생성 및 초기값저장 
		 */
		int[] scores = { 83, 90, 87 };
		// int 타입의 변수선언 변수sum을 0으로 초기화
		int sum = 0;
		/*
		 * for(제어)문으로 scores.length 보다 작을때까지 실행
		 * 이때 scores.length 는 배열의 길이를 얻는 읽기전용 배열객체의 필드값입니다.
		 * 여기서 length 는 3이며 이는 곳 배열객체의 필드가 3개란 뜻입니다.
		 */
		for (int i = 0; i < scores.length; i++) {
			/*
			 * += 누적 연산자 자신의 값에 우측값을 더한값
			 * 이때 sum변수는 for문 블록 밖에서 선언하였으므로 사라지지않고 계속 합산이된다.
			 */
			sum += scores[i];	
		}
		System.out.println("총합 : " + sum);
		/*
		 * 더블타입의 avg변수선언으로 평균값 sum / scores.length 을 받을때
		 * 실수의 짤림을 방지하기위해 사전에 (scores.length * 1.0) 로 실수값으로 캐스팅한다.
		 * 이때 우선 연산할 피연산자에 ( )를 하여야한다.
		 * 그렇지않으면 결과값은 전혀다르다. 
		 * 		ex) double avg = sum / scores.length * 1.0   86.0 
		 * 			double avg = sum / (scores.length * 1.0) 86.66666666666667
		 */
		double avg = sum / (scores.length * 1.0);
		System.out.println("평균 : " + avg);
	}

}
