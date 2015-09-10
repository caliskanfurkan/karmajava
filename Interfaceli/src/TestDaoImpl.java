
public class TestDaoImpl implements TestDao {

	private String data = null;

	@Override
	public void insert(String str) {
		data=str;
	}

	@Override
	public void delete(String str) {
		data=null;

	}

	@Override	
	public String read() {
		return data;
	}

}
