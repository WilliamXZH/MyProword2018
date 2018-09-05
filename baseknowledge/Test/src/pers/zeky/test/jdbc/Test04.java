/**
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package pers.zeky.test.jdbc;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

/**
 * Project Name: Test
 * @Ttile: Test04
 * @Description:
 * @author william zeky
 * @date: 2018年2月26日 上午11:29:39
 * 
 * Modified By: william zeky
 * Modified Time: 2018年2月26日 上午11:29:39
 * Modified Remarks:
 *
 * @version
 * @Copyright 
 */
public class Test04 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		Map<String, String> map2 = new HashMap<>();
		map2.put("test", map.get("test"));
		System.out.println(map2.get("test"));
		// Timestamp.valueOf(map2.get("test"));
		System.out.println();
		System.out.println(JSONObject.fromObject(map));


	}

}
