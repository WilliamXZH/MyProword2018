package pers.zeky.test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Common {
	
	private IntegerWrapper id;
	private Integer c = 0;
	private List<IntegerWrapper> list = new ArrayList<IntegerWrapper>();
	

	public IntegerWrapper getId() {
		return id;
	}

	public void setId(IntegerWrapper id) {
		this.id = id;
	}

	public void test(Integer i){
		c++;
		id.setVal(i);
		if (c%10==0){
			System.out.println();
		}
		System.out.print(c+":"+id+"\t");
	}
	
	public void test2(){
		c++;
		//id = new Random().nextInt(1000);
		id = Counter.getCounter();
		
		if (list.contains(id)){
			System.out.println("Error-"+id.getVal());
		}else if(id!=null){
			list.add(id);
			if (c%10==0){
				System.out.println();
			}
			System.out.print(c+":"+id.getVal()+"\t");
		}
	}
	
	public void test3(){
		System.out.println("\nNumbers not contained:");
		for (int i=0;i<100;i++){
			if(!list.contains(i)){
				System.out.print(i+"\t");
			}
		}
	}

}
