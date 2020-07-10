package com.vmlens.concurrent.hashMap;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class SynchronizedMapBenchmark extends AbstractBenchmark {

	@Override
	protected Map create() {

		return Collections.synchronizedMap(new HashMap());
	}

}
