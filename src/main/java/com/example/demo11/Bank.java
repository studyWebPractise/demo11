package com.example.demo11;

public class Bank {
	// ����l��
	private String branch = "TTA����";
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

	// TODO �ݭn�غc�l��...?
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
	 * �s��
	 * 
	 * @param money �s�J���B
	 * @return
	 */
	public void saving(int money) {
		if (money < 0) {
			System.out.println("�s�ڥ��ѡA���B���o���t��");
			return;
		}
		this.balance += money;
		System.out.println("�s�ڦ��\�A�ثe�l�B:" + this.balance);

	}

	/**
	 * ����
	 * 
	 * @param money ��X���B
	 * @return
	 */
	public void withdraw(int money) {
		if (money < 0) {
			System.out.println("���ڥ��ѡA���B���o���t��");
			return;
		}
		if (this.balance < money) {
			System.out.println("���ڥ��ѡA���B����");
			return;
		}
		this.balance -= money;
		System.out.println("���ڦ��\�A�Ѿl���B:" + this.balance);

	}

	@Override
	public String toString() {
		return "bank [bankName=" + branch + ", userName=" + userName + ", balance=" + balance + "]";
	}

}
