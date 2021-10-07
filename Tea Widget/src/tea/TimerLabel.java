package tea;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerLabel extends JLabel {
	private static final long serialVersionUID = -5853013269074028077L;
	Timer timer;
	int remainingTime = 60000;
	
	
	public TimerLabel() throws InterruptedException {
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	repaint();
            	if(remainingTime > 0) {
            		remainingTime -= 1000;
            	} else {
            		timer.stop();
            		
            	}
            }
        });
        timer.setInitialDelay(1);
        setFont (new Font ("Roboto", Font.BOLD, 50));
        setForeground(new Color(5, 5, 5));
    }

    public String getRemainingTime() {
        long hr = TimeUnit.MILLISECONDS.toHours(remainingTime);
        final long min = TimeUnit.MILLISECONDS.toMinutes(remainingTime - TimeUnit.HOURS.toMillis(hr));
        final long sec = TimeUnit.MILLISECONDS.toSeconds(remainingTime - TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min));

        return String.format("%02d:%02d:%02d", hr, min, sec);
    }

    @Override
    public String getText() {
            return getRemainingTime();
    }
    
    public void start() {
        timer.start();
    }
    
    public void stop() {
    	timer.stop();
    }
    
    public boolean checker() {
    	return timer.isRunning();
    }
    
}
