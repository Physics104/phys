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


public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
					Menu window = new Menu();
					window.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//initialize
	public Menu(){
		initialize();
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 218, 185));
		separator.setForeground(new Color(64, 224, 208));
		separator.setBounds(10, 11, 464, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 69, 0));
		separator_1.setBackground(new Color(255, 218, 185));
		separator_1.setBounds(10, 447, 464, 2);
		contentPane.add(separator_1);
		
		JButton btnProblem1 = new JButton("Problem 1");
		btnProblem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					boolean value = true;
					
					if( value == true){
						Menu.disappear();
						//contentPane.setVisible(false);
						
						//Menu menu = new Menu();
						//menu.dispose();
						//menu.setVisible(false);
						ProbOne.appear();
						}
					}catch(Exception f){					
			}
			}
		});
		btnProblem1.setHorizontalAlignment(SwingConstants.LEFT);
		btnProblem1.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		btnProblem1.setBounds(94, 260, 120, 23);
		contentPane.add(btnProblem1);
		
		JButton buttonProblem2 = new JButton("Problem 2");
		buttonProblem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					boolean value = true;
					
					if( value == true){
						Menu.disappear();
						//contentPane.setVisible(false);
						
						//Menu menu = new Menu();
						//menu.dispose();
						//menu.setVisible(false);
						ProbTwo.appear();
						}
					}catch(Exception f){					
			}
			}
		});
		buttonProblem2.setHorizontalAlignment(SwingConstants.LEFT);
		buttonProblem2.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		buttonProblem2.setBounds(94, 294, 120, 23);
		contentPane.add(buttonProblem2);
		
		JButton btnConversionCalculator = new JButton("Conversion");
		btnConversionCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConversionCalculator.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		btnConversionCalculator.setHorizontalAlignment(SwingConstants.LEFT);
		btnConversionCalculator.setBounds(94, 328, 120, 23);
		contentPane.add(btnConversionCalculator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 247, 204, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(224, 24, 18, 412);
		contentPane.add(separator_3);
		
		JLabel lblInclinedPlanes = new JLabel("Inclined Planes");
		lblInclinedPlanes.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		lblInclinedPlanes.setBounds(20, 19, 200, 50);
		contentPane.add(lblInclinedPlanes);
		
		JLabel lblDefinition = new JLabel("Definition");
		lblDefinition.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				JTextPane txtpnDefinition = new JTextPane();
				txtpnDefinition.setVisible(true);
				txtpnDefinition.setFont(UIManager.getFont("TextArea.font"));
				txtpnDefinition.setEditable(false);
				txtpnDefinition.setText("In physics, a tilted surface is called an inclined plane. Objects are known to accelerate down inclined planes because of an unbalanced force. To understand this type of motion, it is important to analyze the forces acting upon an object on an inclined plane. (Physics Classroom, n.d.).");
				txtpnDefinition.setBounds(245, 24, 229, 249);
				contentPane.add(txtpnDefinition);
			}
			
		});
		lblDefinition.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 14));
		lblDefinition.setBounds(30, 93, 80, 16);
		contentPane.add(lblDefinition);
		
		JLabel labelEquation = new JLabel("Equation");
		labelEquation.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 14));
		labelEquation.setBounds(30, 120, 80, 16);
		contentPane.add(labelEquation);
		
		JLabel labelApplication = new JLabel("Application");
		labelApplication.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 14));
		labelApplication.setBounds(30, 147, 112, 16);
		contentPane.add(labelApplication);
		
		
	}

}
