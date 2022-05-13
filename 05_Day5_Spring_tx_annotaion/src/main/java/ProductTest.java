import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dept.xml");
		
		ProductService service = ctx.getBean("deptService", ProductService.class);
		
		System.out.println("p01상품 5개 주문합니다.");
		try {
			service.addOrder("p01", 5);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러 발생, 롤백 처리");
		}
		
		List<OrderDTO> list2 = service.selectOrder();
		
		List<ProductDTO> list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}
		
		System.out.println(list2.size());
		
		for (OrderDTO odto : list2) {
			System.out.println(odto);
		}
	}

}
