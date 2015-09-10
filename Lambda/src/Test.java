import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("furkan", "ali", "cevdet", "zehra", "deli", "yavri");

		Collections.sort(list, (arg0, arg1) -> oha(arg0.compareTo(arg1)) ? -1 : 1);

		for (String obj : list) {
			System.out.println(obj.toString());
		}
	}

	static Boolean oha(int a) {
		if (a > 0) {
			return true;
		} else
			return false;
	}
}
