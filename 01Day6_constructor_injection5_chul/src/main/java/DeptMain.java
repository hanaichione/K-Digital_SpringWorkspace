import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		DeptService s = (DeptService)ctx.getBean("deptService");
		List<String> list = s.getList();
		System.out.println(list);
	}

}
