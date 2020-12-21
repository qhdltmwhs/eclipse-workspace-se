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
		System.out.println();
		System.out.println("----------기본형 1차원 배열----------");
		int[] korArray = new int[10];
		korArray[0] = 00;
		korArray[1] = 11;
		korArray[2] = 22;
		korArray[3] = 33;
		korArray[4] = 44;
		korArray[5] = 55;
		korArray[6] = 66;
		korArray[7] = 77;
		korArray[8] = 88;
		korArray[9] = 99;
		int korTot = 0;
		for (int i = 0; i < korArray.length; i++) {
			korTot = korTot + korArray[i];
		}
		System.out.println("국어총점 : " + korTot);
		System.out.println("국어평균 : " + korTot / korArray.length);
		
		char[] ca = new char[6];
		ca[0] = 'H';
		ca[1] = 'E';
		ca[2] = 'L';
		ca[3] = 'L';
		ca[4] = 'O';
		ca[5] = '!';
		
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		System.out.println("----------학생데이타를 저장하기위한 배열객체생성 초기화----------");
		/*
		noArrary = new int[10];		
		noArrary[0] = 1;
		noArrary[1] = 2;
		...
		*/
		int[] noArray = {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray = {"KIM", "LEE", "PARK", "CHOI", "SIM", "GOO", "PIM", "MIN", "AIM", "LIM"};
		int[] kora = {34, 56, 12, 89, 91, 67, 88, 93, 67, 99};
		int[] enga = {44, 57, 21, 83, 93, 76, 81, 67, 12, 39};
		int[] matha = {90, 56, 34, 67, 23, 88, 99, 78, 55, 80};
		int[] tota = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] avga = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		char[] gradea = {'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F'};
		int[] ranka = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArray[i], nameArray[i], kora[i], enga[i], matha[i], tota[i], avga[i], gradea[i], ranka[i]);
		}
		
		
		

	}

}
