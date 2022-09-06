package com.lara.pack19.produser.consumer.blockingQuequ;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerProducerPoisonClient {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        //new Thread(new Producer(queue)).start();
        //new Thread(new Consumer(queue)).start();

        Integer poison = -1;
        new Thread(new ProducerPoison(queue, poison)).start();
        new Thread(new ProducerPoison(queue, poison)).start();

        new Thread(new ConsumerPoison(queue, poison)).start();
        new Thread(new ConsumerPoison(queue, poison)).start();

	}
}
