package com.vmlens.concurrent.hashMap;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public abstract class AbstractBenchmark {
	private final Map forGet;
	private Map forPut;
	public static final int MAX_KEY = 10000000;
	Integer element = 1;
	protected abstract Map create();
	public AbstractBenchmark() {
		forGet = create();
		Random random = new Random();
		final int maxKey = 10000;
		for (int i = 0; i < 1000; i++) {
			forGet.put(random.nextInt(maxKey), element);
		}

		forGet.put(100, element);
	}
	@Setup(Level.Iteration)
	public void setup() {
		forPut = create();
	}
	@Benchmark
	public Object get() {
		return forGet.get(100);
	}
	@Benchmark
	public Object put() {
		int key = ThreadLocalRandom.current().nextInt(MAX_KEY);
		return forPut.put(key, element);
	}
}
