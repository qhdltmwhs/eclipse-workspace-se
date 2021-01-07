
public class ControlPriorityLowerUpperMain {

	public static void main(String[] args) {
		System.out.println("1.main");
		ControlPriorityUpperThread ut = new ControlPriorityUpperThread();
		ControlPriorityLowerThread lt = new ControlPriorityLowerThread();
		/*
		 * priority
		 * 		- CPU의 점유권을 얻을수있는 우선순위
		 * 		- 1~10 까지의 우선순위를 가짐
		 */
		System.out.println("ControlPriorityUpperThread---> " + ut.getPriority());
		System.out.println("ControlPriorityLowerThread---> " + lt.getPriority());
		/*
		 *  cmd 모드에서 실행시킬것~!
		 *  >cd bin 폴더 주소 ex) C:\JAVA_BACKEND\eclipse-workspace-se\20.쓰레드[Thread]\bin
		 *  >java ControlPriorityLowerUpperMain
		 *  	클래스파일명 확장자없이! ex) .class 빼고 복사 ctrl + c  후 cmd창에 마우스 오른쪽 클릭하면 붙여넣기 자동
		 */
		ut.setPriority(10);
		lt.setPriority(1);
		ut.start();
		lt.start();
		
		System.out.println("99.main");

	}

}
