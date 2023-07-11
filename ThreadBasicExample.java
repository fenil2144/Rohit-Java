class ThreadA extends Thread{
	
	public void run(){
		System.out.println("ThreadA Class: "+Thread.currentThread());
		for(int i=20;i>0;i--) {
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread()+" with i= "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadBasicExample {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Thread "+Thread.currentThread());
		
		ThreadA threadA = new ThreadA();
		ThreadA threadA2 = new ThreadA();
		
		threadA.start();
		threadA2.start();
	}

}
