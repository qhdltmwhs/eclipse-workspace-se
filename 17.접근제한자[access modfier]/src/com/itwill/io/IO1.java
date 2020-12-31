package com.itwill.io;

public class IO1 {
	/*
	 * 사용자들이 상속받아 사용 할수있는 멤버
	 */
	protected int protected_member_field;
	protected void protected_method() {
		System.out.println("IO1.protected_method()");
	}
	/*
	 * 사용자들이 접근 할수없는 멤버
	 * 같은패키지에 있는 다른 클래스들만 사용가능
	 */
	int defalut_member_field;
	void defalut_method() {
			System.out.println("IO1.default_method()");
	}
}
