package generic;

import java.util.Comparator;

public class NameAscComparator implements Comparator<Account> {
	/*
	 * [Quiz] 2차정렬 이름이 동일할시 번호순으로 오름차순
	 */
	@Override
	public int compare(Account o1, Account o2) {
		String name1 = o1.getOwner();
		String name2 = o2.getOwner();
		int result = name1.compareTo(name2);
		if (result == 0) {
			return o1.getNo() - o2.getNo();
		}
		return result;
	}

}
