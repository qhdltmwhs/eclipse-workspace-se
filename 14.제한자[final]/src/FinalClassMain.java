/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.
       식별자는 대문자로 선언한다.    
       변경금지
*/
public class FinalClassMain {

	public static void main(String[] args) {
		FinalClassChild fcc1 = new FinalClassChild();
		fcc1.method1();
		fcc1.method2();

	}

}
