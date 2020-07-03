package com.vmlens.concurrent.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class LinkedBlockingQueueBenchmark extends AbstractBenchmark {

	
	public LinkedBlockingQueueBenchmark() {
		super(new LinkedBlockingQueue(AbstractBenchmark.QUEUE_SIZE));
	}

	
}
