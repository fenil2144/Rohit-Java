class ThreadA extends Thread{
	
	public void run(){
		System.out.println("ThreadA Class: "+Thread.currentThread());
		for(int i=20;i>0;i--) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread()+" with i= "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadRunnable "+Thread.currentThread());
		for(int i=20;i>0;i--) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread()+" with i= "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ThreadBasicExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Method Thread "+Thread.currentThread());
		
		ThreadA threadA = new ThreadA();
		ThreadA threadA2 = new ThreadA();
		threadA2.setPriority(9);

		threadA.start();
		threadA2.start();
		
		ThreadRunnable threadRunnable = new ThreadRunnable();
		Thread threadUsingRunnable = new Thread(threadRunnable);
		Thread threadUsingRunnable1 = new Thread(threadRunnable);
		
		threadUsingRunnable1.setDaemon(true);
		threadA.join();
		threadUsingRunnable.start();
		

	}

}
