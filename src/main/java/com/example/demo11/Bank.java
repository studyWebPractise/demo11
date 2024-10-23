package com.example.demo11;

public class Bank {
	// 給初始值
	private String branch = "TTA分行";
	private String userName;
	private int balance = 0;

	public String getBankName() {
		return branch;
	}

	public void setBankName(String bankName) {
		this.branch = bankName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	// TODO 需要建構子嗎...?
//	public bank(String bankName, String userName, int balance) {
//		super();
//		this.bankName = bankName;
//		this.userName = userName;
//		this.balance = balance;
//	}
//
//	public bank() {
//	}

	/**
	 * 存款
	 * 
	 * @param money 存入金額
	 * @return
	 */
	public void saving(int money) {
		if (money < 0) {
			System.out.println("存款失敗，金額不得為負數");
			return;
		}
		this.balance += money;
		System.out.println("存款成功，目前餘額:" + this.balance);

	}

	/**
	 * 提款
	 * 
	 * @param money 領出金額
	 * @return
	 */
	public void withdraw(int money) {
		if (money < 0) {
			System.out.println("提款失敗，金額不得為負數");
			return;
		}
		if (this.balance < money) {
			System.out.println("提款失敗，金額不足");
			return;
		}
		this.balance -= money;
		System.out.println("提款成功，剩餘金額:" + this.balance);

	}

	@Override
	public String toString() {
		return "bank [bankName=" + branch + ", userName=" + userName + ", balance=" + balance + "]";
	}

}
