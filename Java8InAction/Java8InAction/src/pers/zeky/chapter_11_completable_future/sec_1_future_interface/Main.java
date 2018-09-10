package pers.zeky.chapter_11_completable_future.sec_1_future_interface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Double> future = executor.submit(new Callable<Double>(){

			@Override
			public Double call() throws Exception {
				// TODO Auto-generated method stub
				return doSomeLongComputation();
			}

			private Double doSomeLongComputation() {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
		doSomethingElse();
		
		try{
			Double result = future.get(1,TimeUnit.SECONDS);
		}catch (ExecutionException ee){
			//计算抛出一个异常
			ee.printStackTrace();
		} catch (InterruptedException e) {
			//当前线程在等待过程中被中断
			e.printStackTrace();
		} catch (TimeoutException e) {
			//在Future对象完成之前超过已过期
			e.printStackTrace();
		}
		
	}

	private static void doSomethingElse() {
		// TODO Auto-generated method stub
		
	}
	
}
