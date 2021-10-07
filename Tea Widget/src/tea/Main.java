package tea;

public class Main {
	public static void main(String[] args) {
		try {
			GraphicsClass g = new GraphicsClass();
			g.setVisible(true);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
}