package pers.zeky.test.thread;

import javax.annotation.Resource;

public class MyThread extends Thread {
	
	private Integer ids;
	
	@Resource
	private Common common;

	public MyThread(Integer id) {
		super();
		this.ids= id;
	}

	public MyThread(Integer ids, Common common) {
		super();
		this.ids = ids;
		this.common = common;
	}

	public Common getCommon() {
		return common;
	}

	public Thread setCommon(Common common) {
		//System.out.println("???");
		this.common = common;
		return this;
	}

	@Override
	public void run(){
		//System.out.println(id);
		common.test(ids);
	}
	
	public static void main(String[] args) {
		
		for (int i=0;i<1000l;i++){
			new MyThread(i).start();
		}
		
	}

}
