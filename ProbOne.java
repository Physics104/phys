import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;

import java.awt.Color;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.DropMode;
import javax.swing.JMenuBar;
import javax.swing.JTextField;


public class ProbOne extends JFrame {

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
							contentPane.setVisible(false);
							
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
		
		JLabel lblProblem = new JLabel("Problem 1");
		lblProblem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProblem.setBounds(10, 11, 79, 14);
		contentPane.add(lblProblem);
		
		textFieldP2_Angle = new JTextField();
		textFieldP2_Angle.setText("10");
		textFieldP2_Angle.setBounds(42, 39, 42, 20);
		contentPane.add(textFieldP2_Angle);
		textFieldP2_Angle.setColumns(10);
		
		JComboBox comboBoxP2_5 = new JComboBox();
		comboBoxP2_5.setMaximumRowCount(2);
		comboBoxP2_5.setModel(new DefaultComboBoxModel(new String[] {"kg", "g"}));
		comboBoxP2_5.setToolTipText("");
		comboBoxP2_5.setBounds(109, 39, 57, 20);
		contentPane.add(comboBoxP2_5);
		
		JLabel lblP2_1 = new JLabel("box starts at rest and slides ");
		lblP2_1.setBounds(176, 42, 186, 14);
		contentPane.add(lblP2_1);
		
		textFieldP2_m1 = new JTextField();
		textFieldP2_m1.setText("3.5");
		textFieldP2_m1.setBounds(366, 39, 65, 20);
		contentPane.add(textFieldP2_m1);
		textFieldP2_m1.setColumns(10);
		
		JComboBox comboBoxP2_8 = new JComboBox();
		comboBoxP2_8.setModel(new DefaultComboBoxModel(new String[] {"m", "cm"}));
		comboBoxP2_8.setToolTipText("");
		comboBoxP2_8.setMaximumRowCount(2);
		comboBoxP2_8.setBounds(440, 39, 57, 20);
		contentPane.add(comboBoxP2_8);
		
		JLabel lblP2_3 = new JLabel("down a ramp inclined at an angle of");
		lblP2_3.setBounds(42, 67, 262, 14);
		contentPane.add(lblP2_3);
		
		textFieldP2_m2 = new JTextField();
		textFieldP2_m2.setText("10");
		textFieldP2_m2.setBounds(306, 64, 65, 20);
		contentPane.add(textFieldP2_m2);
		textFieldP2_m2.setColumns(10);
		
		JLabel lblP2_6 = new JLabel("\u00B0 with the horizontal.");
		lblP2_6.setBounds(376, 67, 159, 14);
		contentPane.add(lblP2_6);
		
		JLabel lblP2_9 = new JLabel("If there is no friction between the ramp surface an crate, what is the");
		lblP2_9.setBounds(42, 89, 489, 16);
		contentPane.add(lblP2_9);
	
		JLabel lblP2_10 = new JLabel("velocity of the crate at the bottom of the ramp?");
		lblP2_10.setBounds(42, 110, 429, 14);
		contentPane.add(lblP2_10);
		/**
		textFieldP2_coefficient = new JTextField();
		textFieldP2_coefficient.setText("0.12");
		textFieldP2_coefficient.setBounds(199, 98, 65, 20);
		contentPane.add(textFieldP2_coefficient);
		textFieldP2_coefficient.setColumns(10);
		
		lblP2_12 = new JLabel(". Taking upward as the positive direction");
		lblP2_12.setBounds(270, 101, 262, 14);
		contentPane.add(lblP2_12);
		
		JLabel lblP2_13 = new JLabel(" for the hanging mass, what will be the acceleration be?  What will be the tension in the");
		lblP2_13.setBounds(40, 120, 506, 14);
		contentPane.add(lblP2_13);
		
		JLabel lblP2_14 = new JLabel("string and the speed of each object at");
		lblP2_14.setBounds(42, 137, 230, 14);
		contentPane.add(lblP2_14); **/
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String SangleValue = textFieldP2_Angle.getText();
				float fAngle = Float.parseFloat(SangleValue);
				System.out.println("angle = " + fAngle);
				
				String Smass1 = textFieldP2_m1.getText();
				float fMass1 = Float.parseFloat(Smass1);
				System.out.println("mass 1 = " + fMass1);
				
				String Smass2 = textFieldP2_m2.getText();
				float fMass2 = Float.parseFloat(Smass2);
				System.out.println("mass 2 = " + fMass2);
				
				String Scoefficient = textFieldP2_coefficient.getText();
				float fCoefficient = Float.parseFloat(Scoefficient);
				System.out.println("coefficient of friction = " + fCoefficient);
				
				String STime = textFieldP2_Time.getText();
				float fTime = Float.parseFloat(STime);
				System.out.println("coefficient of friction = " + fTime);
				//float solve = (fCoefficient + fAngle + fMass1 + fMass2);
				//System.out.printf("%.3f", solve);
				
				
				
				
			}
		});
		btnSolve.setBackground(UIManager.getColor("Button.highlight"));
		btnSolve.setBounds(42, 153, 89, 23);
		contentPane.add(btnSolve);
		
		JLabel lblRequiredAcceleration = new JLabel("Required: Acceleration");
		lblRequiredAcceleration.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRequiredAcceleration.setBounds(43, 181, 141, 14);
		contentPane.add(lblRequiredAcceleration);
		
		JLabel lblSolution = new JLabel("Solution:");
		lblSolution.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSolution.setBounds(43, 193, 73, 14);
		contentPane.add(lblSolution);
	/*	
		textFieldP2_Time = new JTextField();
		textFieldP2_Time.setText("2.00");
		textFieldP2_Time.setColumns(10);
		textFieldP2_Time.setBounds(262, 134, 42, 20);
		contentPane.add(textFieldP2_Time);
		
		JLabel lblSAfterBeing = new JLabel("s after being released at rest?");
		lblSAfterBeing.setBounds(306, 204, 175, 14);
		contentPane.add(lblSAfterBeing);
		*/
		JLabel lblP2_Sol1 = new JLabel("B1");
		lblP2_Sol1.setBounds(42, 218, 29, 14);
		contentPane.add(lblP2_Sol1);
		
		JLabel lblP2_Sol2 = new JLabel("T - Fg = ma");
		lblP2_Sol2.setBounds(42, 243, 89, 14);
		contentPane.add(lblP2_Sol2);
		
		JLabel lblTMg = new JLabel("T - mg = ma");
		lblTMg.setBounds(42, 262, 89, 14);
		contentPane.add(lblTMg);
		
		JLabel lblT = new JLabel("T -");
		lblT.setBounds(42, 283, 29, 14);
		contentPane.add(lblT);
		
		JLabel label = new JLabel("(" );
		label.setBounds(70, 283, 79, 14);
		contentPane.add(label);
		
		//GET VALUES
		//textFieldP2_Angle.getText();

		
		
	}
}
