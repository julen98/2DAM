package tea;

public class Main {
	public static void main(String[] args) {
		try {
			Graphics g = new Graphics();
			g.setVisible(true);
			
			for (int i = 0; i > -1; i++) {
				g.repaint();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
