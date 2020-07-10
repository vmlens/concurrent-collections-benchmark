package com.vmlens.concurrent.hashMap;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class BaselineBenchmark {
	int x = 923;
	@Benchmark
	public int get() {
		return x;
	}
}
