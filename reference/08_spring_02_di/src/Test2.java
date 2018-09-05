import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;


public class Test2
{
	private static ApplicationContext context;

	public static void main(final String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		final User user = (User) context.getBean("test2");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	}

}
