import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;


public class Test3
{
	private static ApplicationContext context;

	public static void main(final String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		final User user = (User) context.getBean("test3");


		System.out.println(user.getUsername());

		final Iterator<String> iterator = user.getPhoneSet().iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
