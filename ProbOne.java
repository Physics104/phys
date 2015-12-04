import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;


import java.awt.Color;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.PrintStream;
import java.awt.SystemColor;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JMenuBar;
import javax.swing.JTextField;


public class ProbOne extends JFrame {

	private JPanel contentPane;
	private JTextField m1;
	private JTextField length1;
	private JTextField angle;
	private JTextField textFieldP2_coefficient;
	private JLabel lblP2_12;
	private JTextField textFieldP2_Time;
	
	private PrintStream standardOut;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProbOne window = new ProbOne();
					window.setVisible(true);
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
					ProbOne window = new ProbOne();
					window.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//initialize
	public ProbOne(){
		initialize();
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Back");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					try{
						boolean value = true;
						
						if( value == true){
							ProbOne.disappear();
							dispose();

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
		
		JLabel lblProblem = new JLabel("Problem 1");
		lblProblem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProblem.setBounds(10, 11, 79, 14);
		contentPane.add(lblProblem);
		
		m1 = new JTextField();
		m1.setText("10");
		m1.setBounds(42, 39, 42, 20);
		contentPane.add(m1);
		m1.setColumns(10);
		
		JComboBox comboBoxP2_5 = new JComboBox();
		comboBoxP2_5.setMaximumRowCount(2);
		comboBoxP2_5.setModel(new DefaultComboBoxModel(new String[] {"kg", "g"}));
		comboBoxP2_5.setToolTipText("");
		comboBoxP2_5.setBounds(109, 39, 57, 20);
		contentPane.add(comboBoxP2_5);
		
		JLabel lblP2_1 = new JLabel("box starts at rest and slides ");
		lblP2_1.setBounds(176, 42, 186, 14);
		contentPane.add(lblP2_1);
		
		length1 = new JTextField();
		length1.setText("3.5");
		length1.setBounds(366, 39, 65, 20);
		contentPane.add(length1);
		length1.setColumns(10);
		
		JComboBox comboBoxP2_8 = new JComboBox();
		comboBoxP2_8.setModel(new DefaultComboBoxModel(new String[] {"m", "cm"}));
		comboBoxP2_8.setToolTipText("");
		comboBoxP2_8.setMaximumRowCount(2);
		comboBoxP2_8.setBounds(440, 39, 57, 20);
		contentPane.add(comboBoxP2_8);
		
		JLabel lblP2_3 = new JLabel("down a ramp inclined at an angle of");
		lblP2_3.setBounds(42, 67, 262, 14);
		contentPane.add(lblP2_3);
		
		angle = new JTextField();
		angle.setText("10");
		angle.setBounds(306, 64, 65, 20);
		contentPane.add(angle);
		angle.setColumns(10);
		
		JLabel lblP2_6 = new JLabel("\u00B0 with the horizontal.");
		lblP2_6.setBounds(376, 67, 159, 14);
		contentPane.add(lblP2_6);
		
		JLabel lblP2_9 = new JLabel("If there is no friction between the ramp surface an crate, what is the");
		lblP2_9.setBounds(42, 89, 489, 16);
		contentPane.add(lblP2_9);
	
		JLabel lblP2_10 = new JLabel("velocity of the crate at the bottom of the ramp?");
		lblP2_10.setBounds(42, 110, 429, 14);
		contentPane.add(lblP2_10);
		
		JLabel lblRequiredAcceleration = new JLabel("Required: Acceleration");
		lblRequiredAcceleration.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRequiredAcceleration.setBounds(43, 181, 141, 14);
		contentPane.add(lblRequiredAcceleration);
		
		JLabel lblSolution = new JLabel("Solution:");
		lblSolution.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSolution.setBounds(43, 193, 73, 14);
		contentPane.add(lblSolution);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 11));
		textArea.setBounds(53, 218, 719, 279);
		contentPane.add(textArea);
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		standardOut = System.out;
		System.setOut(printStream);
		System.setErr(printStream);
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String SM1 = m1.getText();
				float fM1 = Float.parseFloat(SM1);
				System.out.println("Mass = " + fM1);
				
				String SLength1 = length1.getText();
				float fLength1 = Float.parseFloat(SLength1);
				System.out.println("Length = " + fLength1);
				
				String SAngle = angle.getText();
				float fAngle = Float.parseFloat(SAngle);
				System.out.println("Angle = " + fAngle);
				
				String SCoefficient = textFieldP2_coefficient.getText();
				float fCoefficient = Float.parseFloat(SCoefficient);
				System.out.println("coefficient of friction = " + fCoefficient);
				
				String STime = textFieldP2_Time.getText();
				float fTime = Float.parseFloat(STime);
				System.out.println("coefficient of friction = " + fTime);
				
				//computations na nasa terminal
				
				
			}
		});
		
		btnSolve.setBackground(UIManager.getColor("Button.highlight"));
		btnSolve.setBounds(42, 153, 89, 23);
		contentPane.add(btnSolve);
		
	}
}
