

public class GenericsRunner {
	public static void main(String[] args)
	{
		MyCustomList<String> list1 = new MyCustomList<>();
		list1.addElement("E1");
		list1.addElement("E2");
		System.out.println(list1);
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		System.out.println(list2);
		Integer n = list2.get(0);
		System.out.println(n);
	}
}
