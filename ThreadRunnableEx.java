package multithreading;

public class ThreadRunnableEx implements Runnable{
	public void run() {
		for(int i=0;i<=9;i++) {
			System.out.println(i);
		}
	}
}
