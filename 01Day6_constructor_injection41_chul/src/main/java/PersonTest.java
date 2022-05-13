import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Dog;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일반 자바 코드
//		Cat c = new Cat("나비", 10);
//		Dog d = new Dog("멍멍이", 10);
//		Person p = new Person("홍길동", 20, c, d);
//		System.out.println(p);
//		System.out.println("---------------------------------------");

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");

		Person xxx = ctx.getBean("xxx", Person.class);
		System.out.println(xxx);	
		
		Cat c = (Cat)ctx.getBean("catBean");
		System.out.println(c.getCatName());	// 야옹이
		
		Dog d = xxx.getDog();
		Cat c1 = xxx.getCat();
		System.out.println(d + "\t" + c1);	// Dog [DogName=멍멍이, DogAge=10] Cat [CatName=야옹이, CatAge=20]
	}

}
