package com.java.mycourses.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	private static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 100000).sum();
	}
	
	private static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}
	
	private static long checkPerformanceResult(Supplier<Integer> supplier, int times) {
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<times; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime));
		return (endTime - startTime);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20);
		checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20);
	}

}
