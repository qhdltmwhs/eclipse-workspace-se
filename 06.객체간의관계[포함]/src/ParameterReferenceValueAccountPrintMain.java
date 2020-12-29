
public class ParameterReferenceValueAccountPrintMain {

	public static void main(String[] args) {
		ParameterReferenceValueAccountPrint p = new ParameterReferenceValueAccountPrint();
		p.printInt(23423423);
		
		Account acc = new Account(1111, "KIM", 34000, 0.3);
		System.out.println("----------main account[호출전]----------");
		p.printAccount(acc);
		System.out.println("----------main account[호출후]----------");
		acc.print();
		
	}

}
