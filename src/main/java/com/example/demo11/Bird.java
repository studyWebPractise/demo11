package com.example.demo11;

public class Bird extends Animal {

	public Bird() {
		super();// �i�g�i���g
	}

	// �]���ݩʬO�~�ӨӪ� �ҥH�ŧi���ɭԭn�Ψ�����O�ŧi��k
	public Bird(String name, int age) {
		super(name, age);
	}

	// super.getName() (|| getName())�~�Ӥ����O(�W���O)��public��k
	// �]���b�����O name�Oprivate
	public void flying() {
		System.out.println(super.getName() + "���b��");
	}

	public void flying2() {
		System.out.println("���~" + age + "���A" + getName() + "���b��");
	}

	@Override
	
	public void eat() {
		System.out.println(getName() + "�Y����");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + "�Ϋܦh");
	}

}
