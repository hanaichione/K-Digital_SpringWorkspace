import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/student.xml");
		
		Student stu1 = (Student)ctx.getBean("stu");
		Student stu2 = (Student)ctx.getBean("stu");
		System.out.println(stu1==stu2);	// singletone = true
										// prototype = false
		// singletone이 default, 아무것도 안 적어주면 하나만 생성 가능(여러개 만들어도 주소 동일)
		
//		Student stu3 = (Student)ctx.getBean("stu2");
//		System.out.println(stu1==stu3);	// false
	}

}
