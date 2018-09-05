import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;
import com.hand.service.UserService;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(
				"applicationcontext.xml");
		User user = (User) context.getBean("user");
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
		
		UserService userService = (UserService) context.getBean("userservice");
		userService.add(user);
	}

}
