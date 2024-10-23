package com.example.demo11;

public class Submarine extends Boat implements Dive{

	@Override
	public void diving() {
		System.out.println("Submarine is diving");
	}

	@Override
	public void move() {
		System.out.println("Submarine is moving");

	}
	
}
