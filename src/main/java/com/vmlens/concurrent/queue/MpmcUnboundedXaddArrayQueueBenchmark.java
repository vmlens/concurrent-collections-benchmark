package com.vmlens.concurrent.queue;

import java.util.Queue;

import org.jctools.queues.MpmcUnboundedXaddArrayQueue;

/*
 * 

Name:com.vmlens.concurrent.queue.MpmcUnboundedXaddArrayQueueBenchmark
     2       817776.740        47601.973  
     4      1628414.101        60091.115  
     8      3128548.167        41687.042  
     16      5808278.934       426225.604  
     32      8485006.858       557732.660  
     48     10497230.813       326055.598  
     64     12176510.564       954080.129  
     72     12486073.633      1147101.338  




 * 
 */


public class MpmcUnboundedXaddArrayQueueBenchmark extends AbstractBenchmark {

	public MpmcUnboundedXaddArrayQueueBenchmark() {
		super(new MpmcUnboundedXaddArrayQueue(128));
	}

}
