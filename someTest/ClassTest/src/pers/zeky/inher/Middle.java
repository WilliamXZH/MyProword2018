package pers.zeky.inher;

import javax.annotation.Resource;

public class Middle {

	@Resource
	SubClass subClass;
	
	public void execute(){
		subClass.execute();
	}
	
}
