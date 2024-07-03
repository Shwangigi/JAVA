package ch12.beeptest;

import java.awt.Toolkit;

public class BeepTeask implements Runnable {
	// 소리가 나는 스레드
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 객체화

		for (int i = 0; i < 10; i++) {
			toolkit.beep();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
