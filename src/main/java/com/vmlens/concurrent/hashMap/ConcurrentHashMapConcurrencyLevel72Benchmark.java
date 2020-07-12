package com.vmlens.concurrent.hashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapConcurrencyLevel72Benchmark extends AbstractBenchmark {

	@Override
	protected Map create() {
		
		/*
		 *     public ConcurrentHashMap(int initialCapacity,
                             float loadFactor, int concurrencyLevel) 
		 */
		
		return new ConcurrentHashMap(16,0.75f,72);
	}

}
