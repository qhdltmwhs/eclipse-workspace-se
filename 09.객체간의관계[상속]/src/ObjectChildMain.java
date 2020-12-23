
class ObjectChild /*extends Object */ {
	/*
	 * extends Object 는 생략가능
	 */
}

public class ObjectChildMain {

	public static void main(String[] args) {
		ObjectChild oc = new ObjectChild();
		int hashCode = oc.hashCode();
		System.out.println(hashCode);
		System.out.println(Integer.toHexString(hashCode));
		String str = oc.toString();
		System.out.println(str);
	}
}
