package com.vmlens.concurrent.hashMap;

import java.util.Map;

import org.jctools.maps.NonBlockingHashMap;

public class NonBlockingHashMapBenchmark extends AbstractBenchmark {

	@Override
	protected Map create() {
		return new NonBlockingHashMap();
	}
	
	
}
