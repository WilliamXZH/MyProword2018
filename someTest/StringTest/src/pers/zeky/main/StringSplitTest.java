package pers.zeky.main;

import org.junit.Test;

public class StringSplitTest {
	
	@Test
	public void splitTest(){
		String str = "����ʡ^^^������^^^�ں���^^^�Ƕ����ֵ� �������ں�����������216-5��1-3-1  ��ֻ��Բͨ����ͨ����ͨ��������ݡ�������ݾ��գ���";
		
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
