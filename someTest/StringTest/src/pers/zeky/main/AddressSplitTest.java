package pers.zeky.main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressSplitTest {

	public static List<Map<String,String>> addressResolution(String address){
        String regex="((?<province>[^省]+省|.+自治区)|上海|北京|天津|重庆)(?<city>[^市]+市|.+自治州)(?<county>[^县]+县|.+区|.+镇|.+局)?(?<town>[^区]+区|.+镇)?(?<village>.*)";
//        String regex = "(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)?(?<village>.*)";
//        regex = "(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)?(?<village>.*)";
        Matcher m = Pattern.compile(regex).matcher(address);
        String province = null,city = null,county = null,town = null,village = null;
        List<Map<String,String>> table = new ArrayList<Map<String,String>>();
        Map<String,String> row = null;
        while(m.find()){
            row = new LinkedHashMap<String,String>();
            province = m.group("province");
            row.put("province", province==null?"":province.trim());
            city = m.group("city");
            row.put("city", city==null?"":city.trim());
            county = m.group("county");
            row.put("county", county==null?"":county.trim());
            town = m.group("town");
            row.put("town", town==null?"":town.trim());
            village = m.group("village");
            row.put("village", village==null?"":village.trim());
            table.add(row);
        }
        return table;
    }
	
	public static void main(String[] args) {
		
		String str = "北京北京市海淀区西土城路十号北京邮电大学";
		List<Map<String,String>> l = addressResolution(str);
		for(Map<String,String> m:l){
			System.out.println(m);
		}
		
	}

	
}
