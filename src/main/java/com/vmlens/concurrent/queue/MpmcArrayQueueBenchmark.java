package com.vmlens.concurrent.queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.jctools.queues.MpmcArrayQueue;


public class MpmcArrayQueueBenchmark extends AbstractBenchmark  {

	

	public MpmcArrayQueueBenchmark() {
		super(new MpmcArrayQueue(AbstractBenchmark.QUEUE_SIZE));
	}
}
