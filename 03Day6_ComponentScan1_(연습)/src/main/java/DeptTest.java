import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;
import com.service.DeptService2;

public class DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
		DeptService s = ctx.getBean("deptService", DeptService.class);
		DeptService2 ss = ctx.getBean("xxx", DeptService2.class);
		
		System.out.println(s.DeptService());
		System.out.println(s);
		System.out.println(ss.DeptService());
		System.out.println(ss);
	}

}
