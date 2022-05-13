import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		DeptService s = ctx.getBean("deptService", DeptService.class);
		System.out.println(s.getInfo());
	}

}
