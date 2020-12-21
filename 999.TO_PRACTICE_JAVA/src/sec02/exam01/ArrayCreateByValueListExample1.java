package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		/*
		 * 불가능한 선언초기화
		 * int[] scores;
		 * scores = {83, 90, 87};
		 * Array constants can only be used in initializers
		 * 배열 상수는 이니셜 라이저에서만 사용할 수 있습니다.
		 */
		
		//<<<가능한 배열생성 + 초기화>>>
		
		//case1
		String[] names1 = {"감자바", "홍길동", "신용권"};
		
		//case2
		String[] names = null;
		names = new String[] {"신용권", "홍길동", "감자바"};
		
		//case3
		String[] title = null;
		title = new String[5];
		
		//case4
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum / 3; 
		System.out.println("평균 : " + avg);
	
	}

}
