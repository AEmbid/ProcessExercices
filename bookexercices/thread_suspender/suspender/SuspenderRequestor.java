package suspender;

public class SuspenderRequestor {
	private boolean suspendRequested;
	public synchronized void set(boolean b) {
		suspendRequested = b;
		notifyAll();
	}
	public synchronized void waitForResume() 
				throws InterruptedException{
			while (suspendRequested) {
				wait();
			}
	}
	
}
