import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;


public class Test4
{
	private static ApplicationContext context;

	public static void main(final String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		System.out.println("-------------test 4-1----------");
		final User user1 = (User) context.getBean("test4_1");

		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());
		System.out.println(user1.getCustomerType());


		System.out.println("-------------test 4-2----------");
		final User user2 = (User) context.getBean("test4_2");

		System.out.println(user2.getUsername());
		System.out.println(user2.getPassword());
		System.out.println(user2.getCustomerType());

		//User userDefault1 = (User) context.getBean("userDefault1");		
		//User userDefault2 = (User) context.getBean("userDefault2");
	}

}
