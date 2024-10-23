package com.example.demo11;

public class BankNew extends BankPerson {

	private String branchTitle;

	public BankNew(String id, String name, String branchTitle) {
		super(id, name);
		this.branchTitle = branchTitle;
	}

	public BankNew() {
		super();
	}

	public BankNew(String id, String name) {
		super(id, name);
	}

	public String getBranchTitle() {
		return branchTitle;
	}

	public void setBranchTitle(String branchTitle) {
		this.branchTitle = branchTitle;
	}

}
