import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;


public class Test5
{
	private static ApplicationContext context;

	public static void main(final String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		System.out.println("-------------test 5-1----------");
		final User user1 = (User) context.getBean("test5_1");

		System.out.println(user1.getUsername());
		user1.setUsername("hybris1");

		final User user2 = (User) context.getBean("test5_1");
		System.out.println(user2.getUsername());




		System.out.println("-------------test 5-2----------");
		final User user3 = (User) context.getBean("test5_2");

		System.out.println(user3.getUsername());
		user3.setUsername("hybris2");

		final User user4 = (User) context.getBean("test5_2");
		System.out.println(user4.getUsername());
	}

}
