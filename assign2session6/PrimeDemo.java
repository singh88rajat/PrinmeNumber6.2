package assign2session6;

public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeThread pt = new PrimeThread();
		pt.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread trunnable = new Thread(new PrimeRunnable());
		trunnable.start();

	}

}
