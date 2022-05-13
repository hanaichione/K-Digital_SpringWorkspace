import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DeptDAO d = new DeptDAO();
//		DeptService s = new DeptService(d);
//		System.out.println(s.getList()); 	// dao.getList()
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		DeptService s = ctx.getBean("service", DeptService.class);
		List<String> list =s.getList();
		System.out.println(list);
	}

}
