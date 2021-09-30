package tea;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Graphics extends JFrame {
	
	String GreenTea = "Green tea";
	String BlackTea = "Black tea";
	String WhiteTea = "White tea";
	String OolongTea = "Oolong tea";
	String PuerhTea = "Puerh tea";
	String PurpleTea = "Purple tea";
	String HerbalTea = "Herbal tea";
	String RoiboosTea = "Roiboos tea";
	JComboBox<String> comboBox = new JComboBox<String>();
	JTextField textField = new JTextField(20);
	
	TimerLabel lblTimeLeft;
	
	Container contentpane = getContentPane();
	JPanel panel = new JPanel();
	JButton btnStart = new JButton("Start");
	JButton btnStop = new JButton("Stop");
	
	@SuppressWarnings("unchecked")
	Graphics () {
		try {
			/* Hago la ventana visible, defino el tamano, la posicion, el icono y la 
			 * operacion por defecto de la ventana al cerrarla.
			 */
			setTitle("Tea Widget");
			setSize(750, 350);
			setLocationRelativeTo(null);
			setIconImage (new ImageIcon("tea.png").getImage());
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setVisible(true);
			setContentPane(contentpane);
			
			// Labels
			lblTimeLeft = new TimerLabel();
			lblTimeLeft.setBounds(400, 100, 300, 100);
			panel.add(lblTimeLeft);

			// ComboBox
			comboBox.setVisible(true);
			comboBox.setBounds(75, 75, 100, 25);
			comboBox.addItem(GreenTea);
			comboBox.addItem(BlackTea);
			comboBox.addItem(WhiteTea);
			comboBox.addItem(OolongTea);
			comboBox.addItem(PuerhTea);
			comboBox.addItem(PurpleTea);
			comboBox.addItem(HerbalTea);
			comboBox.addItem(RoiboosTea);
			
			// Defino los botones como visibles y los coloco
			btnStart.setVisible(true);
			btnStart.setBounds(425, 175, 75, 30);
			btnStart.setOpaque(false);
			btnStart.setContentAreaFilled(false);
			btnStart.setBorderPainted(false);
			btnStop.setVisible(true);
			btnStop.setBounds(500, 175, 75, 30);
			btnStop.setOpaque(false);
			btnStop.setContentAreaFilled(false);
			btnStop.setBorderPainted(false);			

			// Defino el layout del panel y anado todos los componentes
			panel.setLayout(null);
			panel.setVisible(true);
			panel.add(btnStart);
			panel.add(btnStop);
			panel.add(comboBox);
			panel.add(textField);
			
			// Anado el panel al container
			contentpane.add(panel);
			contentpane.setVisible(true);
			
			// ActionListeners
			comboBox.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = (String) comboBox.getSelectedItem();
					switch (s) {
					case "Green tea":
						System.out.println(TimerLabel.remainingTime);
						TimerLabel.remainingTime = 60000;
						break;
					case "Black tea":
						TimerLabel.remainingTime = 180000;
						break;
					case "White tea":
						TimerLabel.remainingTime = 120000;
						break;
					case "Oolong tea":
						TimerLabel.remainingTime = 120000;
						break;
					case "Puerh tea":
						TimerLabel.remainingTime = 300000;
						break;
					case "Purple tea":
						TimerLabel.remainingTime = 180000;
						break;
					case "Herbal tea":
						TimerLabel.remainingTime = 300000;
						break;
					case "Roiboos tea":
						TimerLabel.remainingTime = 300000;
						break;
					}
					repaint();
				}
			});
			
			btnStart.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
					lblTimeLeft.start();
		    		}
			});
			
			btnStop.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
					lblTimeLeft.stop();
		    		}
			});
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} // catch
	} // constructor
}// class