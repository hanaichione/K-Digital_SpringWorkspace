import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		Person xxx = ctx.getBean("xxx", Person.class);
		System.out.println(xxx.getName());	// 홍길동
		
		System.out.println("=====================");
		
		Person test = ctx.getBean("test", Person.class);
		System.out.println(test.getName());	// null
	}

}
