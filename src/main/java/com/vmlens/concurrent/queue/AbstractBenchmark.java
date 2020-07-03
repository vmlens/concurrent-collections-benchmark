package com.vmlens.concurrent.queue;

import java.util.Queue;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.GroupThreads;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.infra.Control;

@State(Scope.Benchmark)
public abstract class AbstractBenchmark {
	public static final int QUEUE_SIZE = 1024;
	private static long DELAY_PRODUCER = 1024;
	public AbstractBenchmark(Queue queue) {
		super();
		this.queue = queue;

	}
	private final Queue queue;
	Integer element = 1;
	@Setup(Level.Iteration)
	public void setup() {
		synchronized (queue) {
			queue.clear();
		}
	}
	@Benchmark
	@Group("g")
	@GroupThreads(1)
	public void put(Blackhole bh, Control control) {
		bh.consumeCPU(DELAY_PRODUCER);
		while (!queue.offer(element) && !control.stopMeasurement) {
		}

	}
	@Benchmark
	@Group("g")
	@GroupThreads(1)
	public Object take(Blackhole bh, Control control) {
		Object result = queue.poll();
		while (result == null && !control.stopMeasurement) {
			result = queue.poll();
		}
		return result;

	}
}
