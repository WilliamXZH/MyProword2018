package pers.zeky.test.jdbc;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class Test02 {

    public static void main(String[] args) {
		// System.out.println(Long.valueOf(""));//error
		Map<String, Object> map = new HashMap<>();

		map.put("updateDateFrom", Timestamp.valueOf("2018-1-1 14:27:15"));
		map.put("updateDateTo", Timestamp.valueOf("2018-3-1 15:45:14"));
		System.out.println(map.get("updateDateFrom"));
    }
    
}
