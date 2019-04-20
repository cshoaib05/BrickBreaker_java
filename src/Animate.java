
public class Animate implements Runnable {
	
	BlockBreakerPanel bp;
	
	Animate(BlockBreakerPanel b){
		
		bp = b;
	}
	public void run() {
		
		while(true) {
			
			bp.update();
			try {
			Thread.sleep(9);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

}
}