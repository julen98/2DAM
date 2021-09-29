package tea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerLabel extends JLabel {
	Timer timer;
	int remainingTime = 300000;
	
	public TimerLabel() throws InterruptedException {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.setInitialDelay(1);
        timer.start();
    }

    public String getRemainingTime() {
        long hr = TimeUnit.MILLISECONDS.toHours(remainingTime);
        final long min = TimeUnit.MILLISECONDS.toMinutes(remainingTime - TimeUnit.HOURS.toMillis(hr));
        final long sec = TimeUnit.MILLISECONDS.toSeconds(remainingTime - TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min));
        final long ms = TimeUnit.MILLISECONDS.toMillis(remainingTime - TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min) - TimeUnit.SECONDS.toMillis(sec));

        return String.format("%02d:%02d:%02d.%03d", hr, min, sec, ms);
    }

    @Override
    public String getText() {
            return getRemainingTime();
    }
    
    public void start() {
        timer.start();
    }
    
    public void restart() {
    	timer.restart();
    }
    
}
