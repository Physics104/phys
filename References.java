
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JMenu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;



public class References extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldP2_Angle;
	private JTextField textFieldP2_m1;
	private JTextField textFieldP2_m2;
	private JTextField textFieldP2_coefficient;
	private JLabel lblP2_12;
	private JTextField textFieldP2_Time;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					References window = new References();
					window.setVisible(true);
					Container cp = new Container();
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/references.jpg"));
					cp.add(new JLabel(img));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void disappear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					References window = new References();
					window.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//initialize
	public References(){
		initialize();
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 600);
		//contentPane.add(new JLabel(new ImageIcon("resources/terms.jpg")));
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Back");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					try{
						boolean value = true;
						
						if( value == true){
							References.disappear();
							//contentPane.setVisible(false);
							dispose();
							
							//Menu menu = new Menu();
							//menu.dispose();
							//menu.setVisible(false);
							Menu.appear();
							}
						}
							catch(Exception f){					
						}
			}
		});
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label = new JLabel("");
		//ImageIcon img = new ImageIcon(this.getClass().getResource("/resources/terms.jpg"));
		label.setIcon(new ImageIcon(References.class.getResource("/resources/references.jpg")));
		label.setBounds(0, 0, 709, 513);
		contentPane.add(label);
          
      

	}

}
