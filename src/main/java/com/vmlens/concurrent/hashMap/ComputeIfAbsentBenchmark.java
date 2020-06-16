package com.vmlens.concurrent.hashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;

@State(Scope.Benchmark)
public class ComputeIfAbsentBenchmark {


	public static final int START_CAPICITY = 32;
	public static final int MAX_KEY  = 10000000;

	public static final Function COMPUTE = new Function() {

		public Object apply(Object t) {
			return new Object();
		}

	};
	
	
	
	private  ComputeIfAbsentHashMap computeIfAbsentHashMap = ComputeIfAbsentHashMap.object(START_CAPICITY);
	private  ConcurrentHashMap  concurrentHashMap = new ConcurrentHashMap(START_CAPICITY);


	@Setup(Level.Iteration)
	public void setup()
	{
		 computeIfAbsentHashMap =  ComputeIfAbsentHashMap.object(START_CAPICITY);
		 concurrentHashMap = new ConcurrentHashMap(START_CAPICITY);
	
		
	}
	
	
	
	
	@Benchmark
	public Object concurrentHashMap() {

		int key = ThreadLocalRandom.current().nextInt(MAX_KEY);
		return concurrentHashMap.computeIfAbsent(key, COMPUTE);

	}
	
	
  
	@Benchmark
	public Object computeIfAbsentHashMap() {

		int key = ThreadLocalRandom.current().nextInt(MAX_KEY);
		return computeIfAbsentHashMap.computeIfAbsent(key, COMPUTE);

	}
	
	
	
	
	
	
}
