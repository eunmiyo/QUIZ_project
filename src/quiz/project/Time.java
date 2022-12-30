package quiz.project;

public class Time extends Thread {
	private int time = 0;
	private boolean isTimer = false;
	
	public void run() {
		this.time = 0;
		this.isTimer = true;
		
		//System.out.println(CommonEM.today());
		
		while(this.isTimer) {
			try {
				Thread.sleep(1000); //ms단위
				//System.out.println(CommonEM.today());
				this.time += 1;
			} catch (Exception e) {	
			}
		}
	}
	
	public int endTimer() {
		this.isTimer = false;
		return this.time;
	}
		
}
