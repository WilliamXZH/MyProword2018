import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;
import com.hand.service.UserService;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = new User();
		user.setUsername("will");
		user.setPassword("12321");
		user.setCustomerType("Dealer");

		UserService userService = (UserService) context.getBean("userService");
		//userService.setUserDao(new EmployeeDaoImpl());
		userService.add(user);
	}

}
