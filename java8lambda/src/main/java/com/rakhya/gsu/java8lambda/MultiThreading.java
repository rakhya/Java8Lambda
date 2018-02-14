package com.rakhya.gsu.java8lambda;

public class MultiThreading {
	
	public static void main(String[] args) {
		t1.start();
		t2.start();
	}
	static Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i =0; i<1000; i++) {
				System.out.println("Java7 Thread, This is an old way of doing");
			}
		}
	};


static Thread t1 = new Thread(()-> {
	for (int i =0; i<1000; i++) {
		System.out.println("Java8 Thread");
		}});

static Thread t2 = new Thread(runnable);
}
