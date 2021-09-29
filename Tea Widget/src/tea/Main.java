package tea;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		try {
			Graphics g = new Graphics();
			g.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
