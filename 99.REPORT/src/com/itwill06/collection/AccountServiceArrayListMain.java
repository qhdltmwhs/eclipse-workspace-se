package com.itwill06.collection;

import java.util.ArrayList;

public class AccountServiceArrayListMain {

	public static void main(String[] args) {

		AccountServiceArrayList accountServiceArrayList = new AccountServiceArrayList();
		System.out.println("0.AccountServiceArrayList야 은행계좌추가해줘");
		Account addAccount = new Account(1000, "고소영", 89000, 0.5);
		accountServiceArrayList.addAccount(addAccount);

		System.out.println("1.AccountServiceArrayList야 은행계좌들 총계좌수반환해줘");
		int accountCount = accountServiceArrayList.totAccountNumber();
		System.out.println("총계좌수[main]:" + accountCount);
		System.out.println("2.AccountServiceArrayList야 은행계좌들 전체출력해줘");
		accountServiceArrayList.print();
		System.out.println("3.AccountServiceArrayList야은행계좌들 총잔고 반환해줘");
		int totBalance = accountServiceArrayList.totBalance();
		System.out.println("총잔고[main]:" + totBalance);
		System.out.println("4.AccountServiceArrayList야 계좌번호줄께 계좌한개반환해줘");
		Account findAccount = accountServiceArrayList.findByNo(5555);
		System.out.println("계좌한개[main]");
		findAccount.print();
		System.out.println("5.AccountServiceArrayList야 계좌잔고줄께 잔고이상인 계좌들반환해줘[OPTION]");
		ArrayList<Account> findAccounts = accountServiceArrayList.findByBalance(50000);
		System.out.println(" 반환계좌수:" + findAccounts.size());
		System.out.println(findAccounts);
		System.out.println("7.AccountServiceArrayList야은행계좌들 중에 계좌주이름이 AIM인 계좌들반환해줘");
		System.out.println(accountServiceArrayList.findByName("AIM"));
		System.out.println("9.AccountServiceArrayList야1111번계좌 50000원 출금해줘");
		accountServiceArrayList.chulGum(1111, 50000);
		/*
		 * 8.6666번계좌 4000원 입금해줘
		 */
		System.out.println(" 8.6666번계좌 4000원 입금해줘");
		System.out.println(accountServiceArrayList.findByNo(6666));
		accountServiceArrayList.ipGum(6666, 4000);
		System.out.println(accountServiceArrayList.findByNo(6666));
		System.out.println("9.VIP계좌(잔고 70000원이상)들 반환해줘");
		System.out.println(accountServiceArrayList.findByBalance(70000));
		System.out.println("10.계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceArrayList.sortByBalanceAsc();
		accountServiceArrayList.print();
		System.out.println("11.계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceArrayList.sortByBalanceDesc();
		accountServiceArrayList.print();
		System.out.println(" 15-1.6666번계좌의 이름,잔고,이율 수정(update)");
		System.out.println(accountServiceArrayList.findByNo(6666));
		accountServiceArrayList.updateAccount(6666, "XXX", 30000, 10);
		System.out.println(accountServiceArrayList.findByNo(6666));
		System.out.println(" 15-2.6666번계좌의 이름,잔고,이율 수정(update)");
		Account updateAccount = new Account(6666, "YYY", 900000000, 0.4);
		accountServiceArrayList.updateAccount(updateAccount);
		System.out.println(accountServiceArrayList.findByNo(6666));
		System.out.println("-----------전체계좌 출력-------------");
		accountServiceArrayList.print();
	}

}