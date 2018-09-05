package com.cn.org.ireport.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRAbstractExporter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;

public class TestReportHere {
	public static void main(String[] args) {
		Map parameters=new HashMap();
		ByteArrayOutputStream outPut=new ByteArrayOutputStream();
		FileOutputStream outputStream=null;
		File file=new File("F:/Temp/report.xls");
		String reportModelFile="C:/Users/jack/report2.jasper";
		
		try {
			JasperPrint jasperPrint=JasperFillManager.fillReport(reportModelFile, 
					parameters,new ReportDataSource("��"));
			JRAbstractExporter exporter=new JRPdfExporter();
			
			//����jasperPrint
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			//���������
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outPut);
			//����copy����
			exporter.setParameter(JRPdfExporterParameter.IS_ENCRYPTED,Boolean.TRUE);
			//����
			exporter.setParameter(JRPdfExporterParameter.IS_128_BIT_KEY,Boolean.TRUE);
			
			
			/*
			//��ӡExcel
			JRAbstractExporter exporter = new JRXlsExporter();
			//����jasperPrint 
            exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
            //���������
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,outPut);
            //ȥ������֮ǰ�Ŀհ�
            exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,Boolean.TRUE);
            //��������ҳֻ��ӡ��һ��Sheet��
            exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,Boolean.FALSE);
            //����Excel���ı�����ɫΪĬ�ϵİ�ɫ
            exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,Boolean.FALSE);*/
			exporter.exportReport();
			outputStream=new FileOutputStream(file);
			outputStream.write(outPut.toByteArray());
		} catch (JRException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				outPut.flush();
				outPut.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
