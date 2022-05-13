import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// 기존 방법
//		Person p = new Person();
//		String m = p.getInfo();
//		System.out.println(m);

		// src/main/resources폴더및 person.xml <bean id="xxx" class="com.spring.Person"></bean>
		// 마우스오른쪽 spring bean configuration.xml

		System.out.println("=================================");
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("file:\\c:\\upload\\person.xml");	// xml 생성됨
		
		// p1과 p2의 주소가 동일
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1);
		System.out.println(p1.getInfo());
		
		Person p2 = (Person)ctx.getBean("xxx");
		System.out.println(p2);
		System.out.println(p2.getInfo());
	}

}
