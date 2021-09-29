package tea;
import java.awt.Container;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphics extends JFrame {
	
	private JLabel lblGreenTea = new JLabel();
	private JLabel lblBlackTea = new JLabel();
	private JLabel lblWhiteTea = new JLabel();
	private JLabel lblOolongTea = new JLabel();
	private JLabel lblPuerhTea = new JLabel();
	private JLabel lblPurpleTea = new JLabel();
	private JLabel lblHerbalTea = new JLabel();
	private JLabel lblRoiboosTea = new JLabel();
	private JLabel lblTimeLeft = new JLabel();
	
	private Container contentpane = getContentPane();
	private JPanel panel = new JPanel();
	private JButton btnStart = new JButton("Start!");
	
	int secondsPassed = 0;
	
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed--;
			lblTimeLeft.setText(secondsPassed+"");
		}
	};
	
	Graphics () {
		try {
			/* Hago la ventana visible, defino el tamano, la posicion, el icono y la 
			 * operacion por defecto de la ventana al cerrarla.
			 */
			setTitle("Tea Widget");
			setSize(650, 350);
			setLocationRelativeTo(null);
			setIconImage (new ImageIcon("tea.png").getImage());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setContentPane(contentpane);
			
			// Labels
			labels();
			
			// Defino el boton como visible y lo coloco
			btnStart.setVisible(true);
			btnStart.setBounds(282, 250, 75, 30);
			
			// Defino el layout del panel y anado todos los componentes
			panel.setLayout(null);
			panel.setVisible(true);
			panel.add(btnStart);
			panel.add(lblRoiboosTea);
			panel.add(lblBlackTea);
			panel.add(lblGreenTea);
			panel.add(lblHerbalTea);
			panel.add(lblOolongTea);
			panel.add(lblPuerhTea);
			panel.add(lblPurpleTea);
			panel.add(lblRoiboosTea);
			panel.add(lblWhiteTea);
			panel.add(lblTimeLeft);
			// Anado el panel al container
			contentpane.add(panel);
			contentpane.setVisible(true);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} // catch
	} // constructor

	public void start() {
		timer.schedule(task, 1000, 1000);
	}
	
	private void labels() {
		// Green Tea
		lblGreenTea.setBounds(25, 25, 100, 50);
		lblGreenTea.setHorizontalAlignment(JLabel.CENTER);
		lblGreenTea.setText("");
		lblGreenTea.setFont(new Font("Arial", Font.PLAIN, 16));
			
		// Black Tea
		lblBlackTea.setBounds(25, 140, 270, 30);
		lblBlackTea.setHorizontalAlignment(JLabel.CENTER);
		lblBlackTea.setText("");
		lblBlackTea.setFont(new Font("Arial", Font.PLAIN, 16));
			
		// White Tea
		lblWhiteTea.setBounds(25, 140, 270, 30);
		lblWhiteTea.setHorizontalAlignment(JLabel.CENTER);
		lblWhiteTea.setText("");
		lblWhiteTea.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Ooolong Tea
		lblOolongTea.setBounds(25, 140, 270, 30);
		lblOolongTea.setHorizontalAlignment(JLabel.CENTER);
		lblOolongTea.setText("");
		lblOolongTea.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Puerh Tea
		lblPuerhTea.setBounds(25, 140, 270, 30);
		lblPuerhTea.setHorizontalAlignment(JLabel.CENTER);
		lblPuerhTea.setText("");
		lblPuerhTea.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Purple Tea
		lblPurpleTea.setBounds(25, 140, 270, 30);
		lblPurpleTea.setHorizontalAlignment(JLabel.CENTER);
		lblPurpleTea.setText("");
		lblPurpleTea.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Herbal Tea
		lblHerbalTea.setBounds(25, 140, 270, 30);
		lblHerbalTea.setHorizontalAlignment(JLabel.CENTER);
		lblHerbalTea.setText("");
		lblHerbalTea.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Roiboos Tea
		lblRoiboosTea.setBounds(25, 140, 270, 30);
		lblRoiboosTea.setHorizontalAlignment(JLabel.CENTER);
		lblRoiboosTea.setText("");
		lblRoiboosTea.setFont(new Font("Arial", Font.PLAIN, 16));
		
		// Time Left
		lblTimeLeft.setBounds(25, 25, 25, 25);
		lblTimeLeft.setHorizontalAlignment(JLabel.CENTER);
		
	}// metodo labels
}// class
