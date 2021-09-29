package tea;
import java.awt.Container;
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
	JButton btnStart = new JButton("Start!");
	
	@SuppressWarnings("unchecked")
	Graphics () {
		try {
			/* Hago la ventana visible, defino el tamano, la posicion, el icono y la 
			 * operacion por defecto de la ventana al cerrarla.
			 */
			setTitle("Tea Widget");
			setSize(650, 350);
			setLocationRelativeTo(null);
			setIconImage (new ImageIcon("tea.png").getImage());
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setVisible(true);
			setContentPane(contentpane);
			
			
			
			// ComboBox
			comboBox.setVisible(true);
			comboBox.setBounds(25, 75, 100, 25);
			comboBox.addItem(GreenTea);
			comboBox.addItem(BlackTea);
			comboBox.addItem(WhiteTea);
			comboBox.addItem(OolongTea);
			comboBox.addItem(PuerhTea);
			comboBox.addItem(PurpleTea);
			comboBox.addItem(HerbalTea);
			comboBox.addItem(RoiboosTea);
			
			// Defino el boton como visible y lo coloco
			btnStart.setVisible(true);
			btnStart.setBounds(282, 250, 75, 30);
			
			// Defino el layout del panel y anado todos los componentes
			panel.setLayout(null);
			panel.setVisible(true);
			panel.add(btnStart);
			panel.add(comboBox);
			panel.add(textField);
			
			// Anado el panel al container
			contentpane.add(panel);
			contentpane.setVisible(true);
			
			// ActionListeners
			comboBox.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(comboBox.getSelectedItem().toString());
					switch (comboBox.getSelectedItem().toString()) {
					case "Green Tea":
						lblTimeLeft.remainingTime = 60;
						break;
					case "Black Tea":
						lblTimeLeft.remainingTime = 180;
						break;
					case "White Tea":
						lblTimeLeft.remainingTime = 120;
						break;
					case "Oolong Tea":
						lblTimeLeft.remainingTime = 120;
						break;
					case "Puerh Tea":
						lblTimeLeft.remainingTime = 300;
						break;
					case "Purple Tea":
						lblTimeLeft.remainingTime = 180;
						break;
					case "Herbal Tea":
						lblTimeLeft.remainingTime = 300;
						break;
					case "Roiboos Tea":
						lblTimeLeft.remainingTime = 300;
						break;
					}
				}
			});
			
			btnStart.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
					try {
						lblTimeLeft = new TimerLabel();
						lblTimeLeft.setBounds(450, 50, 100, 50);
						panel.add(lblTimeLeft);
						lblTimeLeft.start();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
			    }
			});
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} // catch
	} // constructor
}// class