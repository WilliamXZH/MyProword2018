import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Project Name: SetDemo
 * Class Name: IteratorDemo01
 * Class Description:
 * @author william zeky
 * Create Time: 2018年1月28日 下午10:02:53
 * 
 * Modified By: william zeky
 * Modified Time: %{date} 下午10:02:53
 * Modified Remarks:
 *
 * @version
 * @Copyright 
 */
public class IteratorDemo02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			list.remove(2);//cause error
			String str = iter.next();
			if("A".equals(str)){
				iter.remove();
			}else{
				System.out.println(str);
			}
		}
		
	}
    /**
     * list set
     */
	
}
