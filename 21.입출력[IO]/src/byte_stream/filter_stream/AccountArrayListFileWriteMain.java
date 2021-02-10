package byte_stream.filter_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

public class AccountArrayListFileWriteMain  {
	public static void main(String[] args) throws Exception {
		/*
		 * List<Account>  --> 파일로저장(accountList.dat)[Quiz]
		 */
		List<Account> accountList=Arrays.asList(
				new Account(1111, "KIM", 56800, 0.3),
				new Account(2222, "KIM", 56000, 0.9),
				new Account(3333, "PAR", 12000, 1.9),
				new Account(4444, "CHO", 89000, 4.9),
				new Account(5555, "SIM", 34000, 0.6),
				new Account(6666, "KIM", 77000, 0.1),
				new Account(7777, "KIM", 11000, 0.3),
				new Account(8888, "GIM", 21000, 2.4),
				new Account(9999, "QIM", 99000, 3.3));
		
		
		DataOutputStream accountListDos =
				new DataOutputStream(
						new FileOutputStream("accountList.dat"));
		
		accountListDos.writeInt(accountList.size());
		
		for (int i = 0; i < accountList.size(); i++) {
			accountListDos.writeInt(accountList.get(i).getNo());
			accountListDos.writeUTF(accountList.get(i).getOwner());
			accountListDos.writeInt(accountList.get(i).getBalance());
			accountListDos.writeDouble(accountList.get(i).getIyul());
		}
		accountListDos.flush();
		accountListDos.close();
		System.out.println(">>>>Account객체data --> accounts.dat파일에저장");
	}
}
