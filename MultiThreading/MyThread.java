

public class MyThread extends Thread{
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + i);
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
