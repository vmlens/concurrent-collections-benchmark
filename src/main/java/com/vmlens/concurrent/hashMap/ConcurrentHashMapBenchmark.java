package com.vmlens.concurrent.hashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapBenchmark extends AbstractBenchmark {

	@Override
	protected Map create() {
		return new ConcurrentHashMap();
	}

}
