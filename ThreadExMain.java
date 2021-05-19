package multithreading;

public class ThreadExMain {
public static void main(String[] args) {
	ThreadEx thread=new ThreadEx();
	thread.start();
	thread.setName("ThreadsDemo");
	thread.setPriority(8);
	System.out.println("Thread name is:"+thread.getName());
	System.out.println("priority is:"+thread.getPriority());
}
}
