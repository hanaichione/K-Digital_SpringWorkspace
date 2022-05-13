import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDAO dao = new TestDAO();
		
		dao.insert(7, "송지민", "용인시"); // arithmethic exception : rollback 됨
		
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO dto : list) {
			System.out.println(dto);
		}
	}

}
