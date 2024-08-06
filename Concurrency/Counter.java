
public class Counter {
	int i = 0;

//	Not thread safe
//	public void increment(int i)
//	{
//		/
//		i++;
//	}
	synchronized public void increment()
	{
		i++;
	}
	public int getI()
	{
		return i;
	}
}
