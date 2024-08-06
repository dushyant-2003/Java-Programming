

public class ThreadBasicRunner {
	public static void main(String[] args)
	{
//		for(int i=101;i<=199;i++)
//		{
//			System.out.print(i + " ");
//			
//		}
//		System.out.println("\nTask 1 Done");
//		for(int i=201;i<=299;i++)
//		{
//			System.out.print(i + " ");
//			
//		}
//		System.out.println("\nTask 2 Done");
//
//		for(int i=301;i<=399;i++)
//		{
//			System.out.print(i + " ");
//		}
//		System.out.println("\nTask 3 Done");
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
//		t2.start();

		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
