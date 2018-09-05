package pers.zeky.main;

import org.junit.Test;

public class StringSplitTest {
	
	@Test
	public void splitTest(){
		String str = "辽宁省^^^沈阳市^^^于洪区^^^城东湖街道 沈阳市于洪区吉力湖街216-5号1-3-1  （只收圆通，中通，申通，百世快递。其他快递拒收！）";
		
		String []strArray = str.split("\\^\\^\\^");
		System.out.println(strArray.length);
		for(String s:strArray){
			System.out.println(s);
		}
		System.out.println(strArray.toString());
		
	}
	
	public static void main(String []args){
		new StringSplitTest().splitTest();
	}

}
