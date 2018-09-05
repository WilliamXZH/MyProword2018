import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.service.AssetService;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		AssetService service = (AssetService) context.getBean("assetService");
		service.add();
	}

}
