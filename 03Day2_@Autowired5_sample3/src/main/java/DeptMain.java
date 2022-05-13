import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DeptService s = new DeptService();
//		DeptDAO d = new DeptDAO();
//		s.setDao(d);
//		System.out.println(s.getList());
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		DeptService s = ctx.getBean("deptService", DeptService.class);
		System.out.println(s);
	}

}
