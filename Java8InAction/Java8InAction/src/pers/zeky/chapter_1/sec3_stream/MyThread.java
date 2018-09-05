package pers.zeky.chapter_1.sec3_stream;

import java.util.Date;

public class MyThread extends Thread{

	private static Integer oNum;
	private Integer cNum;
	private static Date start;
	
	public MyThread(){
		super();
	}
	public MyThread(Integer o){
		start = new Date();
		 oNum = o;
	}
	public static Integer getOnum() {
		System.out.println(new Date().getTime()-start.getTime());
		return oNum;
	}
	public static void setOnum(Integer o){
		oNum = o;
	}
	public Integer getcNum() {
		return cNum;
	}

	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}

	
	public Integer myStart(Integer c){
		this.setcNum(c);
		this.start();
		System.out.println((new Date().getTime()-start.getTime())+":"+getOnum());
		return oNum;
		
	}
	public void myRun(){
		oNum += cNum;
	}
	
	@Override
	public void run(){
		super.run();
		myRun();
	}
	
}
