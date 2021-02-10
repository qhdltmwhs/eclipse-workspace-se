package chapter9.nestedclass;

public class Button {
	
	//인터페이스 타입 필드
	OnClickListener listener;
	
	//매개 변수의 다형성
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//구현 객체의 onClick() 메소드 호출
	public void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스
	public static interface OnClickListener {
		public void onClick();
	}
}
