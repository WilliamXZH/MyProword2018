/**
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package pers.zeky.test.jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Project Name: Test
 * @Ttile: Test05
 * @Description:
 * @author william zeky
 * @date: 2018年2月26日 上午11:45:47
 * 
 * Modified By: william zeky
 * Modified Time: 2018年2月26日 上午11:45:47
 * Modified Remarks:
 *
 * @version
 * @Copyright 
 */
public class Test05 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] data = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF, (byte) 0x00 };
		System.out.println(data);

		// byte[] tt = new String("你".getBytes(), "utf-8").getBytes();
		byte[] tt = "谁".getBytes("utf-16");
		for (int i = 0; i < tt.length; i++) {
			System.out.println(Integer.toHexString(tt[i] & 0xff));
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.txt");
			// fos.write(data);
			fos.flush();
			fos.write("你是谁abc".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
