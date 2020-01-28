package com.ds;

import java.util.concurrent.*;

public class ArrayBlockingQueueExamples {
  public static void main(String... args) {

    ExecutorService pool = new ThreadPoolExecutor(
        10, 100, 1, TimeUnit.SECONDS,
        new LinkedBlockingQueue<>(900)
    );

    for (int i = 0; i < 900; i++) {
      pool.submit(() -> {
        Thread.sleep(1_000);
        return 1+1;
      });
    }
     // 100 threads
  }
}
