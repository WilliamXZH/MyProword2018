/**
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package pers.zeky.test.json;

import com.google.gson.Gson;

import net.sf.json.JSONObject;

/**
 * Project Name: Test
 * @Ttile: BasicTypeJsonTest
 * @Description:
 * @author william zeky
 * @date: 2018年5月16日 下午1:25:48
 * 
 * Modified By: william zeky
 * Modified Time: 2018年5月16日 下午1:25:48
 * Modified Remarks:
 *
 * @version
 * @Copyright 
 */
public class BasicTypeJsonTest {

	public static void main(String[] args) {

		double value = 123;
		System.out.println(JSONObject.fromObject(value));
		Gson gson = new Gson();
		System.out.println(gson.toJson(value));
		System.out.println(gson.toJson(new Long(12345)));

	}

}
