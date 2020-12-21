/*
 배열:  
      - 같은데이타형을 가진 변수여러개의 모음 
      - 배열변수의 선언형식
           데이타타입[] 이름; 
	  - 사용: 
	       1.배열객체의생성	
		   2.배열객체의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int pi;
		pi = 34;
		
		int[] ia = new int[5];
		ia[0] = 11; 
		ia[1] = 22; 
		ia[2] = 33; 
		ia[3] = 44; 
		ia[4] = 55;
		
		System.out.println("--------------------");
		System.out.println(ia);
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		System.out.println("----------for loop----------");
		for (int i = 0; i < 5; i++) {
			System.out.print(ia[i] + " ");
		}
		System.out.println("배열의길이 : " + ia.length);
		for (int i = 0; i < ia.length; i++) {
			System.out.print(ia[i] + " ");
		}

	}

}
