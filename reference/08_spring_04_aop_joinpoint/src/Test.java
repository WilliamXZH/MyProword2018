import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.service.AssetService;
import com.hand.service.UserService;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		AssetService assetservice = (AssetService) context.getBean("assetService");
		UserService userservice = (UserService) context.getBean("userService");
		
		assetservice.add();
		System.out.println();
		userservice.add("111","111");
	}

}
