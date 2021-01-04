import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		
		System.out.println("---------------Objec---------------");
		Account acc1 =  new Account(1111, "KIM", 33000, 0.05);
		Account acc2 =  new Account(2222, "KIM", 23000, 0.15);
		Account acc3 =  new Account(3333, "SIM", 34000, 0.35);
		Account acc4 =  new Account(4444, "XIM", 35000, 0.65);
		Account acc5 =  new Account(5555, "BIM", 99000, 0.95);
		
		Object o1 = acc1;
		Object o2 = acc2;
		Object o3 = acc3;
		Object o4 = acc4;
		Object o5 = acc5;
		
		Object[] anyTimeArray = new Object[5];
		
		anyTimeArray[0] = o1;
		anyTimeArray[1] = o2;
		anyTimeArray[2] = o3;
		anyTimeArray[3] = o4;
		anyTimeArray[4] = o5;
		
		for (int i = 0; i < anyTimeArray.length; i++) {
			Account tempAccount = (Account)anyTimeArray[i];
			tempAccount.print();
		}
		System.out.println("---------------ArrayList[참조형]---------------");
		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("#size : " + size);
		
		System.out.println("***************1.add**************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(new Account(6666, "SIX", 60000, 6.6));
		System.out.println(accountList.toString());
		System.out.println("#size : " + accountList.size());
		accountList.add(0, new Account(1000, "FIRST", 10000, 1.1));
		System.out.println(accountList.toString());
		System.out.println("#size : " + accountList.size());
		
		System.out.println("***************2.set**************");
		accountList.set(3, new Account(3333, "SAM", 330000, 3.3));
		System.out.println(accountList);
		System.out.println("#size : " + accountList.size());
		
		System.out.println("***************3.get**************");
		Account getAccount = (Account)accountList.get(3);
		getAccount.print();
		getAccount = (Account)accountList.get(accountList.size() - 1);
		getAccount.print();
		
		System.out.println("***************4.remove**************");
		Account removeAccount = (Account)accountList.remove(0);
		removeAccount.print();
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		
		System.out.println("***************5.전체출력***************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		System.out.println("*************** 계좌번호 5555번 1개 출력 ***************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 5555) {
				tempAccount.print();
			}
			
		}
		
		System.out.println("************** 계좌이름 KIM인 계좌들 출력 **************");
		
		
		System.out.println("*************** 계좌번호 5555번 계좌삭제  **************");
		
		
		System.out.println("************** 계좌이름 KIM인 계좌들 삭제 **************");
		
	}

}
