package byte_stream.object_stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import byte_stream.filter_stream.Account;

public class AccountArrayListSerializationMain {

	public static void main(String[] args) throws Exception{
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
		/*
		Account[] accounts= {
				new Account(1111, "KIM", 89000, 1.3),
				new Account(2222, "AIM", 45000, 2.7),
				new Account(3333, "FIM", 23000, 4.7),
				new Account(4444, "XIM", 34000, 6.7),
				new Account(5555, "HIM", 78000, 3.7),
				new Account(6666, "AIM", 99000, 5.7),
				new Account(7777, "PIM", 89000, 4.7),
				new Account(8888, "QIM", 91000, 1.7),
				new Account(9999, "MIM", 12000, 0.7),
		};
		*/
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("accList.ser"));
		oos.writeObject(accountList);
		//oos.writeObject(accounts);
		oos.close();
		System.out.println("ArrayList<Account> -->Serailization--> accList.ser");
		
	}

}