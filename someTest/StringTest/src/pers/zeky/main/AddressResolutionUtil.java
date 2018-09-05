package pers.zeky.main;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class AddressResolutionUtil {
	
	/**
     * ������ַ
     * @author lin
     * @param address
     * @return
     */
    public static List<Map<String,String>> addressResolution(String address){
    	//String regex="((?<province>[^ʡ]+ʡ|.+������)|�Ϻ�|����|���|����)(?<city>[^��]+��|.+������)(?<county>[^��]+��|.+��|.+��|.+��)?(?<town>[^��]+��|.+��)?(?<village>.*)";

    	String regex="(?<province>[^ʡ]+������|.*?ʡ|.*?������|.*?��|����|�Ϻ�|����|���)(?<city>[^��]+������|.*?����|.*?������λ|.*?��|��Ͻ��|.*?��|.*?��)(?<county>[^��]+��|.*?��|.*?��|.*?����|.*?��|.*?��)?(?<town>[^��]+��|.*?��|.*?�ֵ�)?(?<village>.*)";
        Matcher m=Pattern.compile(regex).matcher(address);
        String province=null,city=null,county=null,town=null,village=null;
        List<Map<String,String>> table=new ArrayList<Map<String,String>>();
        Map<String,String> row=null;
        while(m.find()){
            row=new LinkedHashMap<String,String>();
            province=m.group("province");
            row.put("province", province==null?"":province.trim());
            city=m.group("city");
            row.put("city", city==null?"":city.trim());
            county=m.group("county");
            row.put("county", county==null?"":county.trim());
            town=m.group("town");
            row.put("town", town==null?"":town.trim());
            village=m.group("village");
            row.put("village", village==null?"":village.trim());
            table.add(row);
        }
        return table;
    }
 
	public static void main(String[] args) {
		System.out.println(addressResolution("����ʡ�人�к�ɽ��"));
		System.out.println(addressResolution("����ʡ��ʩ���������������ݶ�ʩ��"));
		System.out.println(addressResolution("��������Ͻ��������"));
		System.out.println(addressResolution("���ɹ��������˰��˿ƶ�������ǰ��"));
		System.out.println(addressResolution("�����������տ�������տ�����"));
		System.out.println(addressResolution("����ʡʡֱϽ�ؼ�������λ��ɳȺ���ĵ������亣��"));
		System.out.println(addressResolution("���������к�����������·ʮ�ű����ʵ��ѧ"));
		System.out.println(addressResolution("�Ϻ��Ϻ����������㻨�Žֵ�����·33���Ϻ�������Ϣ�����ɷ����޹�˾"));
		System.out.println(addressResolution("����ʡ���������������нֵ���ƽ�³�C��34��"));
		System.out.println(addressResolution("���������к�����������·ʮ�ű����ʵ��ѧ"));
	}
 
}
