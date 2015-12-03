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


public class ProbTwo extends JFrame {

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
					ProbTwo window = new ProbTwo();
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
					ProbTwo window = new ProbTwo();
					window.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//initialize
	public ProbTwo(){
		initialize();
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Back");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProblem = new JLabel("Problem 2");
		lblProblem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProblem.setBounds(10, 11, 79, 14);
		contentPane.add(lblProblem);
		
		JLabel lblP2_1 = new JLabel("Given an incline with angle of ");
		lblP2_1.setBounds(42, 42, 169, 14);
		contentPane.add(lblP2_1);
		
		textFieldP2_Angle = new JTextField();
		textFieldP2_Angle.setText("20");
		textFieldP2_Angle.setBounds(222, 39, 42, 20);
		contentPane.add(textFieldP2_Angle);
		textFieldP2_Angle.setColumns(10);
		
		JLabel lblP2_3 = new JLabel("\u00B0 which has a mass of");
		lblP2_3.setBounds(270, 42, 128, 14);
		contentPane.add(lblP2_3);
		
		textFieldP2_m1 = new JTextField();
		textFieldP2_m1.setText("14");
		textFieldP2_m1.setBounds(400, 38, 65, 20);
		contentPane.add(textFieldP2_m1);
		textFieldP2_m1.setColumns(10);
		
		JComboBox comboBoxP2_5 = new JComboBox();
		comboBoxP2_5.setMaximumRowCount(2);
		comboBoxP2_5.setModel(new DefaultComboBoxModel(new String[] {"kg", "g"}));
		comboBoxP2_5.setToolTipText("");
		comboBoxP2_5.setBounds(475, 38, 57, 20);
		contentPane.add(comboBoxP2_5);
		
		JLabel lblP2_6 = new JLabel("placed upon. It is attached by a rope over a pulley to a mass of");
		lblP2_6.setBounds(42, 63, 354, 14);
		contentPane.add(lblP2_6);
		
		textFieldP2_m2 = new JTextField();
		textFieldP2_m2.setText("3");
		textFieldP2_m2.setBounds(400, 60, 65, 20);
		contentPane.add(textFieldP2_m2);
		textFieldP2_m2.setColumns(10);
		
		JComboBox comboBoxP2_8 = new JComboBox();
		comboBoxP2_8.setModel(new DefaultComboBoxModel(new String[] {"kg", "g"}));
		comboBoxP2_8.setToolTipText("");
		comboBoxP2_8.setMaximumRowCount(2);
		comboBoxP2_8.setBounds(475, 60, 57, 20);
		contentPane.add(comboBoxP2_8);
		
		JLabel lblP2_9 = new JLabel("which hangs vertically. The friction between the mass and the incline is represented");
		lblP2_9.setBounds(42, 80, 489, 16);
		contentPane.add(lblP2_9);
		
		JLabel lblP2_10 = new JLabel(" by a friction coefficient of ");
		lblP2_10.setBounds(40, 101, 152, 14);
		contentPane.add(lblP2_10);
		
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
		contentPane.add(lblP2_14);
		
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
		
		textFieldP2_Time = new JTextField();
		textFieldP2_Time.setText("2.00");
		textFieldP2_Time.setColumns(10);
		textFieldP2_Time.setBounds(262, 134, 42, 20);
		contentPane.add(textFieldP2_Time);
		
		JLabel lblSAfterBeing = new JLabel("s after being released at rest?");
		lblSAfterBeing.setBounds(310, 137, 175, 14);
		contentPane.add(lblSAfterBeing);
		
		//yung values sana mapriprint here sa loob nung text area
		//and mag - aappear lang siya pag pinindot yung solve button
		//pag nirun yung solve nakukuha niya naman na lahat ng values from text box so napapalitan siya ang stuff
		// ay pero hindi pa gumagana yung kg and g
		JTextArea txtrBT = new JTextArea();
		txtrBT.setBackground(UIManager.getColor("Button.background"));
		txtrBT.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrBT.setText("B1\r\nT - Fg = ma\r\nT- mg = ma\r\nT - (m2 here)(9.8) - (m2 here) a\r\nT - (m2 * 9.8 here) = 3a\r\n\r\nB2\r\nFgx - T -Ff  = ma\r\nmg Cos (angle here) - T - (0.12) Fn = ma\r\n");
		txtrBT.setBounds(53, 218, 493, 288);
		contentPane.add(txtrBT);

		//GET VALUES
		//textFieldP2_Angle.getText();

		
		
	}
}
