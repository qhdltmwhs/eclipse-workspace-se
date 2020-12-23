package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		/*
		 *  메인메소드에 매개값을 주지않으면 길이가 0인 String배열이 
		 *  매개값으로 전달된다.
		 */
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			//프로그램 강제종료
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		//String 값을 정수값으로 변환 
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(result);
	}
}
