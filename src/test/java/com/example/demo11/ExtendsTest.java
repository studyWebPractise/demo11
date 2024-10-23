package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {

	@Test
	public void animal2Test() {
		Animal ani = new Animal("ANI", 5);
		ani.eat();
		ani.sleep();

	}

	@Test
	public void animalTest() {
		Animal ani = new Animal();
		ani.setName("ANI");
		ani.eat();
		ani.sleep();

	}

	@Test
	public void birdTest() {

		Bird bird = new Bird();
		bird.setName("BIRD");
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void bird2Test() {
		Bird bird = new Bird("BIRD", 5);
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void bird3Test() {
		// ���M��@�l���O��function ex: List<> list = new ArrayList<>();
		Animal bird = new Bird("BIRD", 5);
		bird.eat();
		bird.sleep();
//		bird.flying(); // �������I�I�I
// 		�o�إu���������O���ŧi����k�A�p�G�l���O��override�N�|���歫�g�����e
	}

	@Test
	public void fatherTest() {
		Father father = new Father("Fa");
		father.walk();
	}

	@Test
	public void sonTest() {
		Son son = new Son("Son");
		son.walk();
		son.playBall();
	}

	@Test
	public void bird4Test() {
		Bird bird = new Bird("BIRD", 5);
		bird.flying();

		// ���s�w�qflyiny
		Bird bird1 = new Bird("BIRD", 5) {

			@Override
			public void flying() {
				System.out.println(super.getName() + "�O�³��C��");
			}
		};
		//�u���bbird1���~�|��{���g���e
		bird1.flying();
		bird.flying();
		bird1.flying();
	}

	@Test
	public void test() {
		int a = 5;
		int b = ++a; // b = a + 1 = a
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int c = b++; // c = b = b + 1
		System.out.println("c = " + b);
		System.out.println("c = " + c);
	}
}
