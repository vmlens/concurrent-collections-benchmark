package com.vmlens.concurrent.hashMap;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.openjdk.jmh.runner.RunnerException;

/*
 * Benchmark                                                 Mode  Cnt        Score   Error  Units
hashMap.ComputeIfAbsentBenchmark.computeIfAbsentHashMap  thrpt        222256.303          ops/s
hashMap.ComputeIfAbsentBenchmark.concurrentHashMap       thrpt       4933066.462          ops/s

 */


public class DetermineSize {

	public static final ComputeIfAbsentHashMap computeIfAbsentHashMap =  ComputeIfAbsentHashMap.object(ComputeIfAbsentBenchmark.START_CAPICITY);
	public static final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ComputeIfAbsentBenchmark.START_CAPICITY);

	
	
	public static void main(String[] args) throws RunnerException, InterruptedException {
		

		
		
		
		long start = System.currentTimeMillis();  
		
		final int keyCount = 5000000;
		final int maxKey =   10000000;

		Random random = new Random();
		
	
	
		for( int i = 0 ; i < keyCount ; i++)
		{
			concurrentHashMap.computeIfAbsent(random.nextInt(maxKey), ComputeIfAbsentBenchmark.COMPUTE);
		}
		
		
		System.out.println( "concurrentHashMap took" + DurationFormatUtils.formatDurationHMS(  System.currentTimeMillis() - start   )  );
		
		
		start = System.currentTimeMillis();  
		
		
		for( int i = 0 ; i < keyCount ; i++)
		{
			computeIfAbsentHashMap.computeIfAbsent(random.nextInt(maxKey), ComputeIfAbsentBenchmark.COMPUTE);
		}
		
		
		System.out.println( "computeIfAbsentHashMap took" + DurationFormatUtils.formatDurationHMS(  System.currentTimeMillis() - start   )  );

		
		
		
		Thread.sleep(3 * 60 * 1000);
		
	}
	
	
}
