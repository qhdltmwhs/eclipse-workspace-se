/*
3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.
       식별자는 대문자로 선언한다.    
       변경금지
*/       

public class FinalFieldMain {

	public static void main(String[] args) {
		FinalField ff1 = new FinalField();
		
		/*
		<< The final field FinalField.INCENTIVE_RATE cannot be assigned >>
		ff1.INCENTIVE_RATE = 0.5;
		ff1.PORT_NUMBER = 9090;
		*/
		
		System.out.println(ff1.INCENTIVE_RATE);
		System.out.println(ff1.PORT_NUMBER);
		
		/*
		<< The final field FinalField.NORTH cannot be assigned >>
		FinalField.NORTH = 10;
		FinalField.SOUTH = 20;
		*/
		
		ff1.move(FinalField.NORTH);
		ff1.move(FinalField.SOUTH);
		ff1.move(FinalField.SOUTH);
		ff1.move(FinalField.WEST);
		ff1.move(FinalField.NORTH);
		ff1.move(FinalField.SOUTH);
		
		
	}

}
