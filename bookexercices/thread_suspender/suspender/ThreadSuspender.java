package suspender;

public class ThreadSuspender extends Thread {
	
	private SuspenderRequestor suspender = new SuspenderRequestor();
	
	public void requestSuspender() {suspender.set(true);}
	public void requestResume() {suspender.set(false);}
	
	String s = "working";
	
	
	public void run() {
		int index = 0;
		try {
			while (true) {
				suspender.waitForResume();
				System.out.println(s.charAt(index++));
				if (index>s.length()) {suspender.set(true);}
			}
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}
