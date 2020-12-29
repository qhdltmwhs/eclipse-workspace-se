
public class AccountCapsulationMain {

	public static void main(String[] args) {
		/*
		 * 힙 메모리상에 Account 객체생성후 메모리 주소값 을
		 * 참조변수 acn1 대입(저장)
		 */
		Account acn1 = new Account();
		
		//계좌 데이타 세팅
		acn1.setAccountData(1, "LEE", 80000, 0.3);
		
		//입금 3000원
		acn1.deposit(3000);
		
		//출금 12000원
		acn1.withDraw(12000);
		
		//이율변경 0.5
		acn1.interestRateChange(0.5);
		
		//계좌정보출력
		acn1.printHeader();
		acn1.print();
		
		int r = acn1.getBalance();
		System.out.println(r);
	}
	

}
