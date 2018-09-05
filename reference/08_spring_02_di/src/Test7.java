import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;
import com.hand.service.UserService;


public class Test7
{
	private static ApplicationContext context;

	public static void main(final String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		final UserService service = (UserService) context.getBean("userService7");
		final User usermodel = (User) context.getBean("user7");

		service.add(usermodel);
	}

}
