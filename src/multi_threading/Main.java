package multi_threading;

class Thread1 extends Thread { // 1
	// Extend thread class

	@Override
	public void run() { // 2-override run meth
		// TODO Auto-generated method stub
		System.out.println("thread-1");
	}
}

class Thread2 implements Runnable { // 1
	// Implement runnable interface
	
	@Override
	public void run() { //2
		// TODO Auto-generated method stub
		System.out.println("thread-2");
	}
}

public class Main {
	public static void main(String[] args) {
		// By using obj of thread class give call to Start meth 
		// which will internally give call to Run meth
		
		Thread1 ob = new Thread1();
		ob.start();
		ob.run();
		
		Thread2 ob2 = new Thread2();
		
		Thread t1 = new Thread(ob2);
		t1.start();
		
	}
	

}
