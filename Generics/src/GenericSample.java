import java.util.Arrays;
import java.util.List;

public class GenericSample {
	public static void main(String[] args) {
		KeyValuePair<String, String> pair = new KeyValuePair<>();
		pair.setKey("ad");
		pair.setValue("Furkan");
		System.out.println(pair);

		KeyValuePair<Integer, String> pair2 = new KeyValuePair<>();
		pair2.setKey(1);
		pair2.setValue("A");
		System.out.println(pair2);
		
		System.out.println(getValue(Arrays.asList("mahmut",1,12,"furkan"), 2));
	}

	static <ABC> ABC getValue(List<ABC> list, int index) {
		return list.get(index);
	}
}
