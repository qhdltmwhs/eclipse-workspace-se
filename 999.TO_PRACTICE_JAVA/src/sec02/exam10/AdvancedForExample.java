package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
