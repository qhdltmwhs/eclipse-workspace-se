package lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 명시적생성(생성자호출)
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		if(name1==name2) {
			System.out.println("name1,name2의 주소값이 동일하다");
		}else {
			System.out.println("name1,name2의 주소값이 동일하지않다.");
		}
		/*
		 * String 객체의 암시적생성
		 * - "" 을 사용 
		 */
		
		String name3="KIM";
		String name4="KIM";
		if(name3==name4) {
			System.out.println("name3의 주소값과 name4의 주소값이 동일하다.");
		}else {
			System.out.println("name3의 주소값과 name4의 주소값이 동일하지 않다.");
		}
		if("KIM"== name3) {
			System.out.println(" \"KIM\" 의 주소값과 name3의 주소값이 동일하다.");
		}
		System.out.println("-----------------String 객체의 문자열비교(equals)--------------------");
		/*
		  <<String>>
		    public boolean equals(String compareString)
		    	- String객체가가지고있는 문자열비교로 재정의
		     Overrides:
				equals in class Object	 
		 */
		if(name1.equals(name2)) {
			System.out.println("name1과 name2의 문자열이동일하다");
		}
		if(name1.equals(name3)) {
			System.out.println("name1과 name3의 문자열이동일하다");
			
		}
		if(name1.equals(name4)) {
			System.out.println("name1과 name4의 문자열이동일하다");
			
		}
		if(name1.equals("KIM")) {
			System.out.println("name1과 KIM 의 문자열이동일하다");
			
		}
		if("KIM".equals("KIM")) {
			System.out.println("KIM 과 KIM 의 문자열이동일하다");
			
		}
	}
}