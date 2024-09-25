package Bai45_Thread;

public class LT extends Thread {
	private int threadNumber;

	public LT(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			LT thread = new LT(i);
			thread.start();
		}
	}

	public void run() {
		int i = 0;
		while (true) {
			if (i == 5)
				break;
			System.out.println(i++ + " from thread " + threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
