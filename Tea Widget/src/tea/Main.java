package tea;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Graphics();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
