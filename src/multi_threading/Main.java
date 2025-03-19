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
	public void run() { // 2
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

		Thread t1 = new Thread(ob2); // Pass Runnable to Thread
		t1.start();

		// 3- Anonymous Thread class

		new Thread() {
			public void run() {
				System.out.println("single-thread");
			}
		}.start();

		// 4- Anonymous Runnable with Thread

		new Thread(new Runnable() {
			public void run() {
				System.out.println("t-4");
			}
		}).start();

	}

}
