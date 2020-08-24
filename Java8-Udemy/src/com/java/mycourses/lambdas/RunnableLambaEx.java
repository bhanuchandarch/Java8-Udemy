package com.java.mycourses.lambdas;

public class RunnableLambaEx {

	public static void main(String[] args) {
		/**
		 * Prior Java 8
		 */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};
		
		new Thread(runnable).start();
		
		/**
		 * After Java 8 with Lambdas
		 */
		
		// () -> {}
		
		Runnable runnableLambda = () -> {
			System.out.println("Inside Runnable 2");
		};
		
		new Thread(runnableLambda).start();
		
		Runnable runnableLamda1 = () -> System.out.println("Inside Runnable 3");
		
		new Thread(runnableLamda1).start();
		
		new Thread(() -> System.out.println("Inside Runnable 4")).start();
	}

}
