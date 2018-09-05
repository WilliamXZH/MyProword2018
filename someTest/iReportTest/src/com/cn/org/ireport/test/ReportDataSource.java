package com.cn.org.ireport.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
/**
*  dataSource��(Ҳ�������������)��ʵ��JRDataSource�ӿ�
*  ͨ������list�����Map���������ʵ�����ݶ�Ӧ
*/
public class ReportDataSource implements JRDataSource{

	private Iterator iter;
	
	//����һ����map�����������ݶ�Ӧ
	Map map = new HashMap();
	
	//�޲εĹ��캯��
	public ReportDataSource(){
		
	}
	
	//��sexΪ�������вι��캯�����������ݳ�ʼ��
	public ReportDataSource(String sex){
		//ͨ���Ա��ȡ��Ӧ�û�������
		List datas=DateSourceBaseFactory.createBeanCollection(sex);
		//Ҫ��List�е����ݵ�������Ҫʹ��Iterator��������
		iter=datas.iterator();
	}
	
	//ͨ��key��ȡvalueֵ
	public Object getFieldValue(JRField arg0) throws JRException {
		return map.get(arg0.getName());
	}

	//�ӿ�JRDataSource�ķ������ж��Ƿ�����һ������
	public boolean next() throws JRException {
		if(iter.hasNext()){
			map=(Map)iter.next();
			return true;
		}
		return false;
	}

}
