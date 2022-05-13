import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person xxx = ctx.getBean("xxx", Person.class);
		Person xxx2 = ctx.getBean("xxx", Person.class);
		Person xxx3 = ctx.getBean("xxx", Person.class);
		Person xxx4 = ctx.getBean("xxx", Person.class);
		
		System.out.println(xxx.getInfo());
		System.out.println(xxx2.getInfo());
		System.out.println(xxx3.getInfo());
		System.out.println(xxx4.getInfo());
	}

}
