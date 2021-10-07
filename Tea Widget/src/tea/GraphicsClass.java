package tea;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

public class GraphicsClass extends JFrame {
	private static final long serialVersionUID = 6013881025259466705L;
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
	ImageIcon arrowUp = new ImageIcon(getClass().getClassLoader().getResource("arrowUp0.png"));
	ImageIcon arrowDown = new ImageIcon(getClass().getClassLoader().getResource("arrowDown0.png"));
	ImageIcon start = new ImageIcon(getClass().getClassLoader().getResource("play.png"));
	ImageIcon pause = new ImageIcon(getClass().getClassLoader().getResource("pause.png"));
	JButton btnStart = new JButton(start);
	JButton btnIncreaseHours = new JButton(arrowUp);
	JButton btnDecreaseHours = new JButton(arrowDown);
	JButton btnIncreaseMins = new JButton(arrowUp);
	JButton btnDecreaseMins = new JButton(arrowDown);
	JButton btnIncreaseSecs = new JButton(arrowUp);
	JButton btnDecreaseSecs = new JButton(arrowDown);
	Color fondo = new Color(240, 0, 74);
	Color fondoCombo = new Color(83, 18, 42);
	int startStop = 0;
	
	GraphicsClass () {
		try {
			/* Hago la ventana visible, defino el tamano, la posicion, el icono y la 
			 * operacion por defecto de la ventana al cerrarla.
			 */
			setTitle("Tea Widget");
			setSize(370, 220);
			setLocationRelativeTo(null);
			setIconImage (new ImageIcon("res/tea.png").getImage());
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setVisible(true);
			setContentPane(contentpane);
			setResizable(false);
			panel.setBackground(fondo);
			
			// Labels and textFields
			lblTimeLeft = new TimerLabel();
			lblTimeLeft.setBounds(80, 20, 300, 100);
			
			// ComboBox
			comboBox.setVisible(true);
			comboBox.setOpaque(true);
			comboBox.setBackground(fondoCombo);
			comboBox.setForeground(fondo);
			comboBox.setBounds(115, 135, 120, 25);
			comboBox.addItem(GreenTea);
			comboBox.addItem(BlackTea);
			comboBox.addItem(WhiteTea);
			comboBox.addItem(OolongTea);
			comboBox.addItem(PuerhTea);
			comboBox.addItem(PurpleTea);
			comboBox.addItem(HerbalTea);
			comboBox.addItem(RoiboosTea);
			comboBox.setUI(new BasicComboBoxUI() {
			    @Override
			    protected ComboPopup createPopup() {
			        BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
			        basicComboPopup.setBorder(new LineBorder(Color.BLACK));
			        return basicComboPopup;
			        
			    }
			});
			
			// Buttons
			buttons();
			
			// Defino el layout del panel y anado todos los componentes
			panel.setLayout(null);
			panel.setVisible(true);
			panel.add(btnStart);
			panel.add(comboBox);
			panel.add(textField);
			panel.add(lblTimeLeft);
			panel.add(btnIncreaseHours);
			panel.add(btnDecreaseHours);
			panel.add(btnIncreaseMins);
			panel.add(btnDecreaseMins);
			panel.add(btnIncreaseSecs);
			panel.add(btnDecreaseSecs);
			
			// Anado el panel al container
			contentpane.add(panel);
			contentpane.setVisible(true);
			
			actionAndChangeListeners();
			checkTime();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Error al ejecutar el programa.");
			ex.printStackTrace();
		} // catch
	} // constructor
	
	private void actionAndChangeListeners() {
		// ChangeListeners
		btnIncreaseHours.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblTimeLeft.remainingTime += 3600000;
				repaint();
			}
		});
		
		btnDecreaseHours.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (lblTimeLeft.remainingTime > 3599999) {
					lblTimeLeft.remainingTime -= 3600000;
					repaint();
				} else {
					lblTimeLeft.remainingTime = 0;
					repaint();
				}
			}
		});
		
		btnIncreaseMins.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblTimeLeft.remainingTime += 60000;
				repaint();
			}
		});
		
		btnDecreaseMins.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (lblTimeLeft.remainingTime > 59999) {
					lblTimeLeft.remainingTime -= 60000;
					repaint();
				} else {
					lblTimeLeft.remainingTime = 0;
					repaint();
				}
			}
		});
		
		btnIncreaseSecs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblTimeLeft.remainingTime += 1000;
				repaint();
			}
		});
		
		btnDecreaseSecs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (lblTimeLeft.remainingTime > 0) {
					lblTimeLeft.remainingTime -= 1000;
					repaint();
				}
			}
		});
		
		// ActionListeners
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = (String) comboBox.getSelectedItem();
				switch (s) {
				case "Green tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 60000;
					break;
				case "Black tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 180000;
					break;
				case "White tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 120000;
					break;
				case "Oolong tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 120000;
					break;
				case "Puerh tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 300000;
					break;
				case "Purple tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 180000;
					break;
				case "Herbal tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 300000;
					break;
				case "Roiboos tea":
					lblTimeLeft.stop();
					lblTimeLeft.remainingTime = 300000;
					break;
				}
				repaint();
			}
		});
		
		btnStart.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
				if (startStop == 0 && lblTimeLeft.remainingTime > 0) {
			    	lblTimeLeft.start();
					startStop = 1;
				} else {
					lblTimeLeft.stop();
					startStop = 0;
				}
			}
		});
	}
	
	private void buttons() {
		// Defino los botones como visibles y los coloco
		btnStart.setVisible(true);
		btnStart.setBounds(25, 55, 45, 30);
		btnStart.setOpaque(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);
		btnIncreaseHours.setVisible(true);
		btnIncreaseHours.setBounds(92, 20, 30, 25);
		btnIncreaseHours.setOpaque(false);
		btnIncreaseHours.setContentAreaFilled(false);
		btnIncreaseHours.setBorderPainted(false);
		btnDecreaseHours.setVisible(true);
		btnDecreaseHours.setBounds(92, 93, 30, 25);
		btnDecreaseHours.setOpaque(false);
		btnDecreaseHours.setContentAreaFilled(false);
		btnDecreaseHours.setBorderPainted(false);
		btnIncreaseMins.setVisible(true);
		btnIncreaseMins.setBounds(165, 20, 30, 25);
		btnIncreaseMins.setOpaque(false);
		btnIncreaseMins.setContentAreaFilled(false);
		btnIncreaseMins.setBorderPainted(false);
		btnDecreaseMins.setVisible(true);
		btnDecreaseMins.setBounds(165, 93, 30, 25);
		btnDecreaseMins.setOpaque(false);
		btnDecreaseMins.setContentAreaFilled(false);
		btnDecreaseMins.setBorderPainted(false);
		btnIncreaseSecs.setVisible(true);
		btnIncreaseSecs.setBounds(235, 20, 30, 25);
		btnIncreaseSecs.setOpaque(false);
		btnIncreaseSecs.setContentAreaFilled(false);
		btnIncreaseSecs.setBorderPainted(false);
		btnDecreaseSecs.setVisible(true);
		btnDecreaseSecs.setBounds(235, 93, 30, 25);
		btnDecreaseSecs.setOpaque(false);
		btnDecreaseSecs.setContentAreaFilled(false);
		btnDecreaseSecs.setBorderPainted(false);
	}// buttons
	
	public void checkTime() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		  @Override
		  public void run() {
			  if (lblTimeLeft.remainingTime == 0) {
		    		playMusic();
		    		teaIsReady();
		    		lblTimeLeft.remainingTime = 60000;
			  }
			  if (lblTimeLeft.checker()) {
					btnStart.setIcon(pause);
					repaint();
				} else {
					btnStart.setIcon(start);
					repaint();
				}
		  }
		}, 0, 100);//wait 0 ms before doing the action and do it evry 1000ms (1second)
	}
	
	@SuppressWarnings("static-access")
	public void teaIsReady() {
		UIManager UI = new UIManager();
		UI.put("OptionPane.background",new ColorUIResource(fondo));
		UI.put("Panel.background",new ColorUIResource(fondo));
		JOptionPane.showMessageDialog(this, "Your tea is ready!", "Your tea is ready!", JOptionPane.INFORMATION_MESSAGE);
    }// teaIsReady
	
	public void playMusic () {
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("timeOver.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error al reproducir la música");
		}
	}// playMusic
	
}// class