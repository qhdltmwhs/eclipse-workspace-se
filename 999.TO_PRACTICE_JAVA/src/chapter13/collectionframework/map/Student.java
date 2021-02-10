package chapter13.collectionframework.map;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (this.no == student.no) && this.name.equals(student.name);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return no + name.hashCode();
	}
}
