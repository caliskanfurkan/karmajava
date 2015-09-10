
public class WebProgrammer {
	public static void main(String[] args) {
		TestDao dao=new TestDaoImpl();
		dao.insert("alo");
		System.out.println(dao.read());
		dao.delete("ali");
		System.out.println(dao.read());
		
	}
}
