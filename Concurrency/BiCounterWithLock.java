
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class BiCounterWithLock {
	
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
//	Not thread safe
//	public void increment()
//	{
//		/
//		i++;
//	}
	public void incrementI()
	{
		//get lock
		lockForI.lock();
		i++;
		lockForI.unlock();
		
		// release lock
	}
    public void incrementJ()
	{
		
		// get lock
		lockForJ.lock();
		j++;
		lockForJ.unlock();
		
		// release lock
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
