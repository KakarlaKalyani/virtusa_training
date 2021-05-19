package multithreading;

public class ThreadEx extends Thread{
   public void run() {
    	for(int i=0;i<=4;i++) {
    		System.out.println(i);
    		try {Thread.sleep(500);}
    		catch(Exception e) {}
    	}
    }
}
