package chapter13.collectionframework.set;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj 객체가 Member타입 객체라면 true값 리턴
		if(obj instanceof Member) {
			//ObJect타입의 obj를 Member타입으로 하위로캐스팅하여 Member타입의 참조변수 member에 주소값저장
			Member member = (Member)obj;
			// (member(비교할참조객체).name과 (this.)name이 같고 (member(비교할참조객체).age와 (this.)age가 같으면 true값 반환 다르면 false
			return member.name.equals(this.name) && (member.age == this.age);
		}else {
			
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		//name와 age 값이 같으면 동일한 hashCode를 리턴
		return name.hashCode() + age;
	}
	
	
}
