package com.vmlens.concurrent.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueBenchmark extends AbstractBenchmark {

	

	public ConcurrentLinkedQueueBenchmark() {
		super(new ConcurrentLinkedQueue());
	}

	
	
}
