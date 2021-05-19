package multithreading;

public class RunnableExMain {
public static void main(String[] args) {
	ThreadRunnableEx  tr=new ThreadRunnableEx();
	Thread t=new Thread(tr);
	t.start();
}
}
