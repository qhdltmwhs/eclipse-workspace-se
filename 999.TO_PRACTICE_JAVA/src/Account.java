
public class Account {
	/*
	 * 멤버필드
	 */
	private int no;				//계좌번호
	private String name;		//계좌주
	private int balance;		//잔고
	private double interestRate;//이율

	/*
	 * 멤버메소드
	 */
	
	//계좌 데이타를 set하는 메소드
	public void setAccountData(int no, String name, int balance, double interestRate ) {
		this.no = no;
		this.name = name;
		this.balance = balance;
		this.interestRate = interestRate;
		return;
	}
	
	//입금 메소드
	public void deposit(int m) {
		//잔고 = 잔고 + 입금
		this.balance = this.balance + m;
		return;	
	}
	
	//출금 메소드
	public void withDraw(int m) {
		//잔고 = 잔고 - 출금
		this.balance = this.balance - m;
		return;
	}
	
	//이율변경 메소드
	public void interestRateChange(double irc) {
		this.interestRate = irc;
		return;
	}
	
	//계좌정보출력header 메소드
	public void printHeader() {
		System.out.println("---------------계좌정보출력---------------");
		System.out.println("번호 계좌주 잔고 이율");
		System.out.println("------------------------------------------");
		return;
	}
	
	//계좌정보출력 메소드
	public void print() {
		System.out.printf("%4d %5s %5d %4.1f%n", no, name, balance, interestRate);
		return;
	}
	//getter & setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
