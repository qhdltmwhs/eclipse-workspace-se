package generic;

import java.util.Comparator;

public class BalanceAscComparator implements Comparator<Account> {
	
	@Override
	public int compare(Account acc1, Account acc2) {
		if( acc1.getBalance() > acc2.getBalance()) {
			return 1;
		}else {
			return -1;
		}
	}
}
