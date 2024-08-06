
public class BiCounter {
	int i = 0;
	int j = 0;
//	Not thread safe
//	public void increment()
//	{
//		/
//		i++;
//	}
	synchronized public void incrementI()
	{
		i++;
	}
	synchronized public void incrementJ()
	{
		j++;
	}
	public int getI()
	{
		return i;
	}
	public int getJ()
	{
		return j;
	}
}
