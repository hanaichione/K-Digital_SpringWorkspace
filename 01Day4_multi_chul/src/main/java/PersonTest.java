import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Animal;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GenericXmlApplicationContext ctx = 
//				new GenericXmlApplicationContext("classpath:com/kkk/animal.xml");	// animal만 가능
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/kkk/*.xml");	//
		
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1.getInfo());
		
		Animal a1 = ctx.getBean("yyy", Animal.class);
		System.out.println(a1.getName());
	}

}
