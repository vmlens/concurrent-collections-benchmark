package com.vmlens.concurrent.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class ArrayBlockingQueueBenchmark  extends AbstractBenchmark  {


	public ArrayBlockingQueueBenchmark() {
		super(new ArrayBlockingQueue(AbstractBenchmark.QUEUE_SIZE));
	}


	
	
	
}
